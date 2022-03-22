//
// Created by 28624 on 2021/11/18.
//
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
bool cmp (const int& x, const int& y){
    return x > y;
}
int findMax(const vector<int>& machines){
    int ret = machines[0];
    for (const auto& cur :machines) {
        if(ret < cur)
            ret = cur;
    }
    return ret;
}
int greedStrategy(vector<int>& works,vector<int>& machines){
    //按作业时间从大到小
    sort(works.begin(),works.end(),cmp);
    int workNum = works.size();
    int machinesNum = machines.size();
    //作业数小于机器数
    if (workNum <= machinesNum){
        int minimalTime = works[0];
        return minimalTime;
    }
    else{
        //为每一个作业选择机器
        for (int i = 0; i < workNum; ++i) {
            int flag = 0;
            int tmp = machines[flag];
            for (int j = 1; j < machines.size(); ++j) {
                if(tmp > machines[j]){
                    flag = j;
                    tmp =machines[j];
                }
            }
            machines[flag] += works[i];
        }
        int minmalTime = findMax(machines);
        return minmalTime;
    }
}
int main()
{
    int n,m;
    cin >>n >>m;
    vector<int> works(n);
    vector<int> machines(m,0);

    for (int i = 0; i < n; ++i) {
        cin >>works[i];

    }
    cout<<greedStrategy(works,machines)<<endl;
    return 0;
}
