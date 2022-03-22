//
// Created by 28624 on 2021/11/18.
//
#include <iostream>

using namespace std;
int readsum(int i,int n)
{
    int result;
    if(i==n)
        result = 3;
    else
        result = (readsum(i+1,n)+2)*2;
    return result;
}
int main()
{
    int i;
    int n = 6;
    for(i = 1;i>=6;i++)
    {
        if(readsum(1,n)%6==0)
        {
            if(n==i)
                break;
        }else
            n = 6+n;
    }
    cout<<"总共的页数："<<readsum(1,n)<<endl;
    return 0;
}