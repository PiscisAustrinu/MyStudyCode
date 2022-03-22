#include <iostream>
using namespace std;
//定义每一天发放奖牌从剩余的部分来源得几分之几
//此处为7
#define Fenmu 7
//创建递归函数，nMedalSum为第N天奖牌总数，包括当天分发的和剩余的两部分之和
int nMedalSum(int i, int n)
{
    int result = 0;
    if (i == n)
    {
        result = Fenmu - 1;
    }
    else{
        result = (nMedalSum(i+1,n)*Fenmu/(Fenmu-1)+i);
    }
    return result;
}
int main()
{
    int n=Fenmu-1;      // 金牌数量必须是6的倍数，此时为6枚
    int m;              //
    for (int i=1; i<=n; i++)
    {
        //第i天时金牌发完
        if ( nMedalSum(i,n)%(Fenmu-1)==0){
            if(n==i){
                break;
            }
        }
        else{
            //6不合适，取6的倍数，例如12,18,24........
            n=n+Fenmu-1;
        }
    }
    cout<< "金牌发放了" << n << "天" << ",总金牌数是：" << nMedalSum(1,n) << "枚" << endl << endl;
    cout<< "每天发放的金牌数为："<< endl << endl;
    for(int j=1;j<=n;j++){
        cout << "第"<< j  << "天发放金牌数是：" <<j << "+" << (nMedalSum(j,n)-j)/7 << "还剩" << (nMedalSum(j,n)-j)/7*6 << "枚"<< endl;
    }
    cout << endl;
    system("pause");
}

