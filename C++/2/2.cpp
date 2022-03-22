//
// Created by 28624 on 2021/11/18.
//
#include<bits/stdc++.h>
using namespace std;
int MaxSum(int a[],int left,int right)
{
    int sum=0;
    if(left==right)
    {
        if(a[left]>0)sum=a[left];
        else sum=0;
    }
    else
    {
        int center=(left+right)/2;
        int leftsum=MaxSum(a,left,center);
        int rightsum=MaxSum(a,center+1,right);
        int s1=0;int lefts=0;
        for(int i=center;i>=left;i--)
        {
            lefts+=a[i];
            if(lefts>s1)s1=lefts;
        }
        int s2=0;int rights=0;
        for(int j=center+1;j<=right;j++)
        {
            rights+=a[j];
            if(rights>s2)s2=rights;
        }
        sum=s1+s2;
        if(sum<leftsum)sum=leftsum;
        if(sum<rightsum)sum=rightsum;
    }
    return sum;
}
int main()
{
    int a[6]={-20,11,-4,13,-5,-2};
    int b=MaxSum(a,0,5);
    cout<<b;
}
