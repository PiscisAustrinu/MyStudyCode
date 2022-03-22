//
// Created by 28624 on 2021/11/12.
//
#include<cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
float skvj(int n)
{
    if(n==1)
        return 11;
    return (skvj(n-1)*(7-n)+1)/(6-n);
}
int main()
{
    printf("%.0f",skvj(5));
    return 0;
}
