#include <stdio.h>
int main(){
  int a = 5;
  char c;
  float f;

  int *pa;
  char *pc;
  float *pf;

  pa = &a;
  pc = &c;
  pf = &f;
  
  printf("a = %d\n", a);
  printf("pa指针指向的内容为 %d", *pa);
} 
