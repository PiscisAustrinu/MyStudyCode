//
// Created by 28624 on 2021/11/18.
//
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void xuanzhe(int a[])
{
    int min;
    for (int i = 0; i < 9; ++i) {
        min = i;
        for (int j = i+1; j <10 ; ++j) {
            if(a[min]>a[j]){
                min = j;
            }
        }
        if(min != i)
        {
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
    cout<<"ѡ������Ľ��Ϊ��";
    for (int i = 0; i < 10; ++i) {
        cout<<a[i]<<' ';
    }
}
void maopao(int a[])
{
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < 9; ++j) {
            if(a[j]>a[j+1])
            {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
    cout<<"ð������Ľ��Ϊ��";
    for (int i = 0; i < 10; ++i) {
        cout<<a[i]<<' ';
    }
}
void cahru(int a[]){
    for (int i = 1; i < 10; ++i) {
        int temp = a[i];
        int j = i-1;
        for ( ; j>=0&&a[j]>temp ;j--) {
            a[j+1] = a[j];
        }
        a[j+1] = temp;
    }
    cout<<"��������Ľ��Ϊ��";
    for (int i = 0; i < 10; ++i) {
        cout<<a[i]<<' ';
    }
}
void merge(int* arr, int p, int mid, int q)
{
    int i,j,k;
    int leftarr[100], rightarr[100];
    int numL = mid - p + 1;
    int numR = q - mid;
    //�� arr ������ [p,mid] �����ڵ�Ԫ����һ������ leftarr ������
    for (i = 0; i < numL; i++) {
        leftarr[i] = arr[p - 1 + i];
    }
    //�� arr ������ [mid+1,q] �����ڵ�Ԫ����һ������ rightarr ������
    leftarr[i] = 2147483647;
    for (i = 0; i < numR; i++) {
        rightarr[i] = arr[mid + i];
    }
    rightarr[i] = 2147483647;
    i = 0;
    j = 0;
    //��һ�Ƚ� leftarr �� rightarr �е�Ԫ�أ�ÿ�ν���С��Ԫ�ؿ����� arr �����е� [p,q] ������
    for (k = p; k <= q; k++) {
        if (leftarr[i] <= rightarr[j]) {
            arr[k - 1] = leftarr[i];
            i++;
        }
        else {
            arr[k - 1] = rightarr[j];
            j++;
        }
    }
}
//ʵ�ַָ�����ĺ���
void merge_sort(int* arr, int p, int q)
{
    int mid;
    if (arr == NULL || p > q || p == q) {
        return ;
    }
    mid = (p + q) / 2;
    //�� [p,q] ��Ϊ[p,mid] �� [mid+1,q] ����
    merge_sort(arr, p, mid);
    merge_sort(arr, mid + 1, q);
    //�Էֺõ� [p,mid] �� [mid,q] ���й鲢����
    merge(arr, p, mid, q);
}
//ʵ�ֹ鲢�����ĺ���

void Quick_Sort(int *arr, int begin, int end){
    if(begin > end)
        return;
    int tmp = arr[begin];
    int i = begin;
    int j = end;
    while(i != j){
        while(arr[j] >= tmp && j > i)
            j--;
        while(arr[i] <= tmp && j > i)
            i++;
        if(j > i){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
    arr[begin] = arr[i];
    arr[i] = tmp;
    Quick_Sort(arr, begin, i-1);
    Quick_Sort(arr, i+1, end);
}
void adjust(int arr[], int len, int index)
{
    int left = 2*index + 1;
    int right = 2*index + 2;
    int maxIdx = index;
    if(left<len && arr[left] > arr[maxIdx]) maxIdx = left;
    if(right<len && arr[right] > arr[maxIdx]) maxIdx = right;  // maxIdx��3��������������±�
    if(maxIdx != index)                 // ���maxIdx��ֵ�и���
    {
        swap(arr[maxIdx], arr[index]);
        adjust(arr, len, maxIdx);       // �ݹ������������������ʵĲ���
    }

}
void heapSort(int arr[], int size)
{
    for(int i=size/2 - 1; i >= 0; i--)  // ��ÿһ����Ҷ�����жѵ���(�����һ����Ҷ��㿪ʼ)
    {
        adjust(arr, size, i);
    }
    for(int i = size - 1; i >= 1; i--)
    {
        swap(arr[0], arr[i]);           // ����ǰ���ķ��õ�����ĩβ
        adjust(arr, i, 0);              // ��δ�������Ĳ��ּ������ж�����
    }
}
void tong(int a[])
{
    int n;
    int k;
    memset(a,0,10);//��b[]��������
    cin >> n;
    for (int i = 1;i <= n;i ++)
    {
        cin >> k;//��ʱ����,���ڽ�������
        a[k] ++;//��������Ӧ��Ͱ����һ�����
    }
    for (int i = 1;i <= 10;i ++)//i����ֵֹ�����ŵ����ֵ����ֵ
    {
        while (a[i] > 0)//��������ǰ�������˵Ļ�
        {
            cout << i << " ";//���
            a[i]--;//ɾ�����
        }
    }
    cout<<"Ͱ����Ľ��Ϊ��";
    for (int i = 0; i < 10; ++i) {
        cout<<a[i]<<' ';
    }
}
int main()
{
    cout<<"���������������У�10��������"<<endl;
    int arr[10];
    for (int i = 0; i < 10; ++i) {
        cin>>arr[i];
    }
    while (1)
    {
        cout<<"��ѡ�����򷽷���\n"
              "1 ѡ������\n"
              "2 ð������\n"
              "3 �������� \n"
              "4 �鲢���� \n"
              "5 ��������\n"
              "6 ������\n"
              "7 Ͱ����"<<endl;
        int a;
        cin>>a;
        switch (a) {
            case 1:
                xuanzhe(arr);
                break;
            case 2:
                maopao(arr);
                break;
            case 3:
                cahru(arr);
                break;
            case 4:
                merge_sort(arr,1,10);
                cout<<"��������Ľ��Ϊ��";
                for (int i = 0; i < 10; ++i) {
                    cout<<arr[i]<<' ';
                }
                break;
            case 5:
                Quick_Sort(arr,0,9);
                cout<<"��������Ľ��Ϊ��";
                for (int i = 0; i < 10; ++i) {
                    cout<<arr[i]<<' ';
                }
                break;
            case 6:
                heapSort(arr,10);
                cout<<"������Ľ��Ϊ��";
                for (int i = 0; i < 10; ++i) {
                    cout<<arr[i]<<' ';
                }
                break;
            case 7:
                tong(arr);
                break;
        }
        cout<<"\n"<<"�����𣿣�Y/y   N/n��"<<endl;
        char b;
        cin>>b;
        if(b=='y'||b=='Y')
            continue;
        else
            break;
    }
}
