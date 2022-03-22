//
// Created by 28624 on 2021/11/18.
//
#include <iostream>

using namespace std;
int getoutsum(int i,int n)
{
    int result = 0;
    if(i==7)
        result = 6;
    else
        result = (getoutsum(i+1,n)-7+i)*2;
    return result;
}
int main()
{
    int i;
    int n = 7;
    for(i = 1;i>=7;i++)
    {
        if(getoutsum(i,n)%7==0)
        {
            if(n==i)
                break;
        } else
            n = 7+n;
    }
    cout<<"发车时车上的乘客："<<getoutsum(1,n)<<endl;
}
