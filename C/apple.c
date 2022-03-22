//
// Created by 28624 on 2021/10/23.
//
#include <stdio.h>
int main(void)
{
    int dui;
    int time;
    scanf("%d %d",&dui,&time);
    int apple[dui];
    int caozuo[time][3];
    for (int i = 0; i < dui; ++i) {
        scanf("%d",&apple[i]);
    }
    for (int i = 0; i < time; ++i) {
        for (int j = 0; j < 3; ++j) {
            scanf("%d",&caozuo[i][j]);
        }
    }
    for (int i = 0; i < time; ++i) {
        if(caozuo[i][0]==1)
        {
            int a = caozuo[i][1];
            apple[a-1] = caozuo[i][2];
        }
        if(caozuo[i][0] == 2)
        {
            int count = 0;
            for (int j = caozuo[i][1]-1,k = j+1; j <caozuo[i][2]&&k <caozuo[i][2]; ++j,++k) {
                    if(apple[k]>=apple[j])
                    {
                        count++;
                    }
            }
            if(count==(caozuo[i][2]-caozuo[i][1]))
                printf("Yes\n");
            else
                printf("No\n");
        }
    }
}
