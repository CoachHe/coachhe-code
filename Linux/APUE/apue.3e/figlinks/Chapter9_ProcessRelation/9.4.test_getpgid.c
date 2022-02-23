#include <unistd.h>
#include <stdio.h>

int main(){
  
  pid_t pid;    //进程ID
  pid_t pgid;   //进程组ID
  
  pgid = getpgid(0);
  pid = getpid();
  
  printf("进程号为：%d\n", pid);
  printf("进程组号为：%d\n", pgid);


  exit(0);
}

