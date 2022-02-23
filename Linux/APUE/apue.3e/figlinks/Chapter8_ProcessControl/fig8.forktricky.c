#include <stdio.h>
int main(){
  int i;
  for(i = 0; i < 2; i++){
    fork();
    int j = getpid();
    printf("%d ", j);
  }

  wait(NULL);
  wait(NULL);

  return 0;
}
