//
// Created by 28624 on 2021/11/12.
//
#include <iostream>
using namespace std;
#define Fenmu 11
int nMedalSum(int i,int n)
{
    int result = 0;
    if(i == n)
    {
        result = Fenmu-1;
    } else{
        result = (nMedalSum(i+1,n)*Fenmu/(Fenmu-1)+i);
    }
    return result;
}
int main()
{
    int n = Fenmu -1;
    int m ;
    for(int i = 1;i<=n;i++)
    {
        if(nMedalSum(i,n)%(Fenmu-1)==0){
            if(n==i)
                break;}
        else
                n = n+Fenmu-1;

    }
    cout<<"遗产分给了"<<n<<"个儿子"<<",遗产总数是"<<nMedalSum(1,n)<<endl;
    cout<<"每个儿子分配到的遗产数为："<<endl;
    for (int i = 1; i <=n; i++) {
        cout<<"第"<<i<<"个儿子分配到的遗产数是："<<i<<"+"<<(nMedalSum(i,n)-i)/10<<"还剩："<<(nMedalSum(i,n)-i)/11*10<<"份"<<endl;
    }

}
