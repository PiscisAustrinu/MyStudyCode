#include <iostream>
using namespace std;
//����ÿһ�췢�Ž��ƴ�ʣ��Ĳ�����Դ�ü���֮��
//�˴�Ϊ7
#define Fenmu 7
//�����ݹ麯����nMedalSumΪ��N�콱����������������ַ��ĺ�ʣ���������֮��
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
    int n=Fenmu-1;      // ��������������6�ı�������ʱΪ6ö
    int m;              //
    for (int i=1; i<=n; i++)
    {
        //��i��ʱ���Ʒ���
        if ( nMedalSum(i,n)%(Fenmu-1)==0){
            if(n==i){
                break;
            }
        }
        else{
            //6�����ʣ�ȡ6�ı���������12,18,24........
            n=n+Fenmu-1;
        }
    }
    cout<< "���Ʒ�����" << n << "��" << ",�ܽ������ǣ�" << nMedalSum(1,n) << "ö" << endl << endl;
    cout<< "ÿ�췢�ŵĽ�����Ϊ��"<< endl << endl;
    for(int j=1;j<=n;j++){
        cout << "��"<< j  << "�췢�Ž������ǣ�" <<j << "+" << (nMedalSum(j,n)-j)/7 << "��ʣ" << (nMedalSum(j,n)-j)/7*6 << "ö"<< endl;
    }
    cout << endl;
    system("pause");
}

