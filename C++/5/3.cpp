//
// Created by 28624 on 2021/11/21.
//
#include <bits/stdc++.h>
using namespace std;

int w[4] = {2,1,3,2},v[4] = {3,2,4,2};
int n = 4,W = 5;
int dp[5][5];		//dp数组

void solve(){
    for(int i = n-1;i >= 0;i--){
        for(int j = 0;j <= W;j++){
            if(j < w[i])
                dp[i][j] = dp[i+1][j];
            else
                dp[i][j] = max(dp[i+1][j], dp[i+1][j-w[i]]+v[i]);
        }
    }
}
int main(void){
    solve();
    printf("%d\n",dp[0][W]);
    return 0;
}
