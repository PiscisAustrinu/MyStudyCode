//
// Created by 28624 on 2021/11/18.
//
#include <iostream>

using namespace std;
# define MaxInt 32767 // 表示极大值 即 ∞ (无穷大)

# define MVNum 100 // 最大顶点数 

typedef int VertexType; // 假设顶点的数据类型为整型

typedef int ArcType; // 假设Vi与Vj之边的权值类型为整型 

typedef struct {
    VertexType vexs[MVNum]; // 顶点表 (存储顶点信息)
    ArcType arcs[MVNum][MVNum]; // 邻接矩阵
    int vexnum,arcnum; // 图的当前顶点数与边数 
}AMGraph; // Adjacent Matrix Graph 邻接矩阵图
ArcType D[MVNum][MVNum]; // 记录顶点Vi和Vj之间的最短路径长度
int Path[MVNum][MVNum];  // 最短路径上顶点Vj的前一顶点的序号
void InitAMGraph(AMGraph &G){
    cout<<"输入顶点数:";
    cin>>G.vexnum;
    cout<<"\n输入边数:";
    cin>>G.arcnum;

    for(int i=0;i<MVNum;i++){
        for(int j=0;j<MVNum;j++){
            if(i!=j){ // 【易错】 初始化<Vi, Vj>时: <Vi,Vj> 路径长度无穷大 (i!=j)
                G.arcs[i][j] = MaxInt;
            } else { //  【易错】 初始化<Vi, Vj>时: <Vi,Vi>【自回环】路径长度为0 (i==i)
                G.arcs[i][j] = 0;
            }
        }
    }
    for(int i=0;i<G.vexnum;i++){
        G.vexs[i] = i;
    }
    cout<<"\n输入边和权重:";
    cout<<"\n格式(i,j,weight): "<<endl;
    int i,j;
    int weight;
    for(int k=0;k<G.arcnum;k++){
        cin>>i;cin>>j;cin>>weight;
        G.arcs[i][j] = weight;
    }
    for (int k = 0; k < i; ++k) {
        for(int l=0;l<j;l++){
            cout<<G.arcs[k][l]<<endl;
        }
    }
    cout<<endl;
}
void ShortestPath_Floyd(AMGraph G){
    //step1 初始化各对结点的已知路径和距离
    for(int i=0;i<G.vexnum;i++){
        for(int j=0;j<G.vexnum;j++){
            D[i][j] = G.arcs[i][j]; //D[i][j] 初始化
            if(D[i][j]<MaxInt && i!=j){ // 【易漏】 i != j (防止产生自回环)
                Path[i][j] = i; // 若 Vi与Vj之间存在弧(有序顶点对)： 将Vj的前驱置为 Vi
            } else {
                Path[i][j] = -1;
            }
        }
    }
    //step2 动态规划(DP)动态更新： <Vi,Vj>更短的最短路径的距离和路径
    for(int k=0;k<G.vexnum;k++){ // 【易错】 中间结点Vk的循环 是在最外层
        for(int i=0;i<G.vexnum;i++){
            for(int j=0;j<G.vexnum;j++){
                if(D[i][k] + D[k][j] < D[i][j]){ // 若从Vi【经Vk】到Vj的一条路径更短
                    D[i][j] = D[i][k] + D[k][j]; // 更新D[i][j]
                    cout<<D[i][k]<<' '<<D[k][j]<<endl;
                    Path[i][j] = Path[k][j]; // 【易错】 更改Vj的前驱为 Vk
                }
            }
        }
    }
}
void OutputD(AMGraph G){
    cout<<"最短路径表:"<<endl;
    for(int i=0;i<G.vexnum;i++){
        for(int j=0;j<G.vexnum;j++){
            cout<<D[i][j]<<"\t";
        }
        cout<<endl;
    }
}
int main(){
    AMGraph G;
    InitAMGraph(G);//易错处
    ShortestPath_Floyd(G); // 【重/难点】易错处
    OutputD(G);
    return 0;
}