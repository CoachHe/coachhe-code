#include <stdio.h>
int main(){
  int a[5] = {1,2,3,4,5};

  // 下标法
  for (int i = 0; i < 5; i++){
    printf("%d ", a[i]);
  }
 
  printf("\n"); 

  //指针法
  int *p = a;
  *p;       //a[0]
  *(p+1);   //a[1]
  *(p+2);   //a[2]
  //以上三种方式p是不会变的
  p++;
  //这里p是会变的
  for(int i = 0; i < 5; i++){
    printf("%d ", *(p+i));
    printf("\n");
    // printf("%d ", *p++);
  }


}
