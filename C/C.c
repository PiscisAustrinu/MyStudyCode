//
// Created by 28624 on 2021/10/23.
//
#include <stdio.h>
#define max 10
int main(void)
{
    int m;
    scanf("%d",&m);
    int people[m];
    int location[m][max];
    for (int i = 0; i <m; ++i) {
        scanf("%d",&people[i]);
        for (int j = 0; j < people[i]; ++j) {
            scanf("%d",&location[i][j]);
        }
    }
    for (int i = 0; i < m; ++i) {
        int leftSickPeople = 1;
        int rightSickPeople = 1;
        int mid = 0;
        for (int j = 0; j < people[i]; ++j) {
            for (int k = j+1 ; k < people[i]; ++k) {
                int a = location[i][k] - location[i][j];
                if(a<=2)
                {
                    leftSickPeople++;
                } else
                    mid = k;
                break;
            }
        }

        if(mid==0)
            rightSickPeople = leftSickPeople;
        else{
            for (int j = mid; j <people[i] ; ++j) {
                for (int k = j+1; k <people[i] ; ++k) {
                    int b = location[i][k] - location[i][j];
                    if(b<=2)
                    {
                        rightSickPeople++;
                    }
                    else
                        break;
                }
            }
        }
        printf("%d %d",leftSickPeople,rightSickPeople);
    }
}
