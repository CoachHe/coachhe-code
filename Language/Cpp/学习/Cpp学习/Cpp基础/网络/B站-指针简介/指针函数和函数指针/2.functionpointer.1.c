#include <stdio.h>
int square(int num){
  return num * num;
}
int main(){
  int num;
  int (*fp)(int);
  printf("please input a number:");
  scanf("%d",&num);
  fp = square;
  printf("fp=0x%x, %d\n", fp, (*fp)(num));
  //printf("fp=0x%x, %d\n", fp, (*fp)(num));
  return 0;
}
  
