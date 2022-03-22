#include <stdio.h>
void g(int x){
    x = x*(x+1);
    return ;
};
int main(){
    int x = 5;
    int a = x>>1;
    g(a);
    printf(a+x);
}
