#include <unistd.h>


int main(){
  pid_t pid;
  pid_t pgid;
  int status;
  int id;
  
  pid = getpid();
  pgid = getpgid(0);

  printf("父进程id=%d\n", pid);
  printf("父进程组id=%d\n", pgid);

  id = fork();
  if (id == 0){
    pid_t tmp_parentid = pid;
    pid = getpid();
    int tmp=setpgid(tmp_parentid, pid);
    if (tmp == -1){
      printf("error");
    }
    // setpgid(pid, pid);
    pgid = getpgid(0);

    printf("子进程id=%d\n", pid);
    printf("子进程组id=%d\n", pgid);

    exit(0);
  }
  wait(&status);
  pid = getpid();
  pgid = getpgid(0);


  printf("父进程id=%d\n", pid);
  printf("父进程组id=%d\n", pgid);
  
exit(0);


}
