//
// Created by 何一智 on 2020/4/21.
//
#include <stdio.h>
int main(){
    int a[3][4]={1,2,3,4,5,6,7,8,9,0,11,12};
    int *p = a;
    printf("%d\n",a);
    printf("%d\n",a[0]);
    printf("%d\n",&a);

    //打印二维数组
    //1 下标法
    for (int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    // 2 指针法
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4;j++){
            printf("%d ", *p++);
        }
        printf("\n");
    }

    return 0;
}


