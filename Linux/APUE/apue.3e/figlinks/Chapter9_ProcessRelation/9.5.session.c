#include <unistd.h>

int main(){
  pid_t pid;
  pid_t pgid;
  pid_t sid;
  int status;

  pid = getpid();
  pgid = getpgid(0);
  sid = getsid(pid);

  printf("父进程id为%d\n",pid);
  printf("父进程组id为%d\n",pgid);
  printf("父进程sid为%d\n",sid);

  int tmpid;
  tmpid = fork();
  if(tmpid == 0){
    pid = getpid();
    sid = getsid(pid);
    printf("子进程目前的sid为%d\n",sid);
    pgid = setsid();
    sid = getsid(pid);
    printf("子进程id为%d\n",pid);
    printf("子进程新组id为%d\n",pgid);
    printf("子进程新sid为%d\n",sid);
    exit(0);
  }
  wait(&status);
  pid = getpid();
  sid = getsid(pid);
  pgid = getpgid(0);
  printf("父进程新id为%d\n",pid);
  printf("父进程新组id为%d\n",pgid);
  printf("父进程新sid为%d\n",sid);
  exit(0);
} 

