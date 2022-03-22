//
// Created by 28624 on 2021/10/23.
//
#include <stdio.h>
#include <string.h>
#define max 100
int Panduan(char ch[])
{
    int flag = 0;
    if(strlen(ch) == 1)
    {
        flag = 1;
    }
    if(ch[0]>=97)
    {
        for (int i = 1; i < strlen(ch); ++i) {
            if(ch[i]<=90)
                flag = 1;
            if(ch[i]>=97)
                return 0;
        }
    } else if(ch[0]<=90)
    {
        for (int i = 1; i < strlen(ch); ++i) {
            if(ch[i]<=90)
                flag = 1;
            if(ch[i]>=97)
                return 0;
        }
    }

    return flag;
}
int main(void)
{
    char ch[max];
    gets(ch);
    int a = Panduan(ch);
    int b = strlen(ch);
    if(a==1)
    {
        for (int i = 0; i <b; ++i) {
            if(ch[i]>=97)
                ch[i] = ch[i]-32;
            else if(ch[i]<=90)
                ch[i] = ch[i]+32;
            printf("%c",ch[i]);
        }
    }
    else if(a==0)
    {
        for (int i = 0; i < b; ++i) {
            printf("%c",ch[i]);
        }
    }
}
