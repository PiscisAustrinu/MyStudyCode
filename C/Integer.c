//
// Created by 28624 on 2021/10/23.
//
#include <stdio.h>
/*
int main(void)
{
    double a;
    scanf("%f",&a);
    if(a<=127)
        printf("byte");
    else if(a>127&&a<=32767)
        printf("short");
    else if(a>32767&&a<=2147483647)
        printf("int");
    else if(a>2147483647&&a<=9223372036854775807)
        printf("long");
    else
        printf("BigInteger");
}
 */
int main(void)
{
    int num;
    scanf("%d",&num);
    int people[num];
    for (int i = 0; i < num; ++i) {
        scanf("%d",&people[i]);
        int a = people[i];
        int location[a];
        for (int j = 0; j < people[i]; ++j) {
            scanf("%d",&location[i]);
        }
        int sickPeople = 1;
        int mid;
        for (int j = 0; j < people[i]; ++j) {
            for (int k = j+1; k <people[i];++k) {
                int b = location[k] - location[j];
                if(b<=2)
                    sickPeople = sickPeople+1;
                else
                    mid=k;
                    break;
            }
        }
        printf("%d",sickPeople);
        int SickPeople = 1;
        for (int j = mid; j < people[i]; ++j) {
            for (int k = j+1; k <people[i] ; ++k) {
                int b = location[k] - location[j];
                if(b<=2)
                    SickPeople = SickPeople+1;
            }
        }
        if(sickPeople>=SickPeople)
            printf("%d %d",sickPeople,SickPeople);
        else
            printf("%d %d",SickPeople,sickPeople);
    }


}