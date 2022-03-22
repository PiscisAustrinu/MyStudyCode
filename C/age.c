//
// Created by 28624 on 2021/10/23.
//
#include <stdio.h>
int main(void)
{
    int m;
    scanf("%d",&m);
    int num[m];
    for (int i = 0; i < m; ++i) {
        scanf("%d",&num[i]);
    }
    for (int i = 0; i < m; ++i) {
        if(num[i]<18)
            printf("%d\n",num[i]);
        else
            printf("18\n");
    }
}