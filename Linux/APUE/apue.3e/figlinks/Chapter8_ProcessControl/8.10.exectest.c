#include <stdio.h>
#include <unistd.h>

int main(){
  int pid;
  pid = fork();
  if(pid == -1){
    printf("fork error");
  }
  printf("%d",pid);
  if(pid != 0){
    wait(1);
    printf("main process\n");
  } else {
    execl("/bin/date","date","+%s",NULL);
    exit(1);
  }
  exit(0);
}
