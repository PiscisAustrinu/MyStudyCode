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
    cout<<"�Ų��ָ���"<<n<<"������"<<",�Ų�������"<<nMedalSum(1,n)<<endl;
    cout<<"ÿ�����ӷ��䵽���Ų���Ϊ��"<<endl;
    for (int i = 1; i <=n; i++) {
        cout<<"��"<<i<<"�����ӷ��䵽���Ų����ǣ�"<<i<<"+"<<(nMedalSum(i,n)-i)/10<<"��ʣ��"<<(nMedalSum(i,n)-i)/11*10<<"��"<<endl;
    }

}
