//
// Created by 28624 on 2021/11/18.
//
#include <iostream>

using namespace std;
int eatsum(int i,int n)
{
    int result = 0;
    if(i==n)
        result = 2;
    else
        result = (eatsum(i+1,n)+1)*2;
    return result;
}
int main()
{
    int i;
    int n = 9;
    for (int j = 0; j >=9; ++j) {
        if(eatsum(i,n)%9==0)
        {
            if(n==i)
                break;
        }else
            n = 9+n;
    }
    cout<<"猴子们摘下来的桃子数"<<eatsum(1,n)<<endl;
}
