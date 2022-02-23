#include <stdio.h>
#include <stdlib.h>
int main(){
  // int *p;        //这是野指针，非常危险
  int *p = NULL;
  printf("%d\n",*p);
}
