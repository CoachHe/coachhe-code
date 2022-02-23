#include <stdio.h>
#include <apue.h>

char buf[] = "-";

int main(){
  int i;
  for(i = 0; i < 2; i++){
    fork();
    write(STDOUT_FILENO, buf, sizeof(buf)-1);
  }

  wait(NULL);
  wait(NULL);

  return 0;
}
