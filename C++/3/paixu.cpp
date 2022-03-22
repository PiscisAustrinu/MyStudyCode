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
    cout<<"选择排序的结果为：";
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
    cout<<"冒泡排序的结果为：";
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
    cout<<"插入排序的结果为：";
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
    //将 arr 数组中 [p,mid] 区域内的元素逐一拷贝到 leftarr 数组中
    for (i = 0; i < numL; i++) {
        leftarr[i] = arr[p - 1 + i];
    }
    //将 arr 数组中 [mid+1,q] 区域内的元素逐一拷贝到 rightarr 数组中
    leftarr[i] = 2147483647;
    for (i = 0; i < numR; i++) {
        rightarr[i] = arr[mid + i];
    }
    rightarr[i] = 2147483647;
    i = 0;
    j = 0;
    //逐一比较 leftarr 和 rightarr 中的元素，每次将较小的元素拷贝到 arr 数组中的 [p,q] 区域内
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
//实现分割操作的函数
void merge_sort(int* arr, int p, int q)
{
    int mid;
    if (arr == NULL || p > q || p == q) {
        return ;
    }
    mid = (p + q) / 2;
    //将 [p,q] 分为[p,mid] 和 [mid+1,q] 区域
    merge_sort(arr, p, mid);
    merge_sort(arr, mid + 1, q);
    //对分好的 [p,mid] 和 [mid,q] 进行归并操作
    merge(arr, p, mid, q);
}
//实现归并操作的函数

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
    if(right<len && arr[right] > arr[maxIdx]) maxIdx = right;  // maxIdx是3个数中最大数的下标
    if(maxIdx != index)                 // 如果maxIdx的值有更新
    {
        swap(arr[maxIdx], arr[index]);
        adjust(arr, len, maxIdx);       // 递归调整其他不满足堆性质的部分
    }

}
void heapSort(int arr[], int size)
{
    for(int i=size/2 - 1; i >= 0; i--)  // 对每一个非叶结点进行堆调整(从最后一个非叶结点开始)
    {
        adjust(arr, size, i);
    }
    for(int i = size - 1; i >= 1; i--)
    {
        swap(arr[0], arr[i]);           // 将当前最大的放置到数组末尾
        adjust(arr, i, 0);              // 将未完成排序的部分继续进行堆排序
    }
}
void tong(int a[])
{
    int n;
    int k;
    memset(a,0,10);//把b[]数组清零
    cin >> n;
    for (int i = 1;i <= n;i ++)
    {
        cin >> k;//临时变量,用于接受输入
        a[k] ++;//把输入相应的桶打上一个标记
    }
    for (int i = 1;i <= 10;i ++)//i的终止值是你排的数字的最大值
    {
        while (a[i] > 0)//如果这个数前面输入了的话
        {
            cout << i << " ";//输出
            a[i]--;//删掉标记
        }
    }
    cout<<"桶排序的结果为：";
    for (int i = 0; i < 10; ++i) {
        cout<<a[i]<<' ';
    }
}
int main()
{
    cout<<"请输入待排序的数列（10个数）："<<endl;
    int arr[10];
    for (int i = 0; i < 10; ++i) {
        cin>>arr[i];
    }
    while (1)
    {
        cout<<"请选择排序方法：\n"
              "1 选择排序\n"
              "2 冒泡排序\n"
              "3 插入排序 \n"
              "4 归并排序 \n"
              "5 快速排序\n"
              "6 堆排序\n"
              "7 桶排序"<<endl;
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
                cout<<"插入排序的结果为：";
                for (int i = 0; i < 10; ++i) {
                    cout<<arr[i]<<' ';
                }
                break;
            case 5:
                Quick_Sort(arr,0,9);
                cout<<"快速排序的结果为：";
                for (int i = 0; i < 10; ++i) {
                    cout<<arr[i]<<' ';
                }
                break;
            case 6:
                heapSort(arr,10);
                cout<<"堆排序的结果为：";
                for (int i = 0; i < 10; ++i) {
                    cout<<arr[i]<<' ';
                }
                break;
            case 7:
                tong(arr);
                break;
        }
        cout<<"\n"<<"继续吗？（Y/y   N/n）"<<endl;
        char b;
        cin>>b;
        if(b=='y'||b=='Y')
            continue;
        else
            break;
    }
}
