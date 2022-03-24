//
// Created by 28624 on 2021/11/18.
//
#include <iostream>

using namespace std;
# define MaxInt 32767 // ��ʾ����ֵ �� �� (�����)

# define MVNum 100 // ��󶥵��� 

typedef int VertexType; // ���趥�����������Ϊ����

typedef int ArcType; // ����Vi��Vj֮�ߵ�Ȩֵ����Ϊ���� 

typedef struct {
    VertexType vexs[MVNum]; // ����� (�洢������Ϣ)
    ArcType arcs[MVNum][MVNum]; // �ڽӾ���
    int vexnum,arcnum; // ͼ�ĵ�ǰ����������� 
}AMGraph; // Adjacent Matrix Graph �ڽӾ���ͼ
ArcType D[MVNum][MVNum]; // ��¼����Vi��Vj֮������·������
int Path[MVNum][MVNum];  // ���·���϶���Vj��ǰһ��������
void InitAMGraph(AMGraph &G){
    cout<<"���붥����:";
    cin>>G.vexnum;
    cout<<"\n�������:";
    cin>>G.arcnum;

    for(int i=0;i<MVNum;i++){
        for(int j=0;j<MVNum;j++){
            if(i!=j){ // ���״� ��ʼ��<Vi, Vj>ʱ: <Vi,Vj> ·����������� (i!=j)
                G.arcs[i][j] = MaxInt;
            } else { //  ���״� ��ʼ��<Vi, Vj>ʱ: <Vi,Vi>���Իػ���·������Ϊ0 (i==i)
                G.arcs[i][j] = 0;
            }
        }
    }
    for(int i=0;i<G.vexnum;i++){
        G.vexs[i] = i;
    }
    cout<<"\n����ߺ�Ȩ��:";
    cout<<"\n��ʽ(i,j,weight): "<<endl;
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
    //step1 ��ʼ�����Խ�����֪·���;���
    for(int i=0;i<G.vexnum;i++){
        for(int j=0;j<G.vexnum;j++){
            D[i][j] = G.arcs[i][j]; //D[i][j] ��ʼ��
            if(D[i][j]<MaxInt && i!=j){ // ����©�� i != j (��ֹ�����Իػ�)
                Path[i][j] = i; // �� Vi��Vj֮����ڻ�(���򶥵��)�� ��Vj��ǰ����Ϊ Vi
            } else {
                Path[i][j] = -1;
            }
        }
    }
    //step2 ��̬�滮(DP)��̬���£� <Vi,Vj>���̵����·���ľ����·��
    for(int k=0;k<G.vexnum;k++){ // ���״� �м���Vk��ѭ�� ���������
        for(int i=0;i<G.vexnum;i++){
            for(int j=0;j<G.vexnum;j++){
                if(D[i][k] + D[k][j] < D[i][j]){ // ����Vi����Vk����Vj��һ��·������
                    D[i][j] = D[i][k] + D[k][j]; // ����D[i][j]
                    cout<<D[i][k]<<' '<<D[k][j]<<endl;
                    Path[i][j] = Path[k][j]; // ���״� ����Vj��ǰ��Ϊ Vk
                }
            }
        }
    }
}
void OutputD(AMGraph G){
    cout<<"���·����:"<<endl;
    for(int i=0;i<G.vexnum;i++){
        for(int j=0;j<G.vexnum;j++){
            cout<<D[i][j]<<"\t";
        }
        cout<<endl;
    }
}
int main(){
    AMGraph G;
    InitAMGraph(G);//�״�
    ShortestPath_Floyd(G); // ����/�ѵ㡿�״�
    OutputD(G);
    return 0;
}