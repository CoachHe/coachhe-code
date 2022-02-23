#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/resource.h>
#include <fcntl.h>
#include <sys/stat.h>

#define FNAME "/tmp/out"

static int daemonize(void){
  pid_t pid;
  int fd;
  //实现守护进程
  pid = fork();
  if(pid < 0){
  perror("fork()");
  return -1;
 }
  if(pid > 0){
   exit(0);
 }
  fd = open("/dev/null",O_RDWR);
  if(fd < 0){
    perror("1");
    exit(1);
  }
  
  dup2(fd,0);
  dup2(fd,1);
  dup2(fd,2);
  if(fd > 2){
    close(fd);
  }

  setsid();
  chdir("/");     //设置到根目录位置

  umask(0);

  return 0;
} 


int main(){
  
  FILE *fp;

  if(daemonize()){  //表示自己的函数名字，用它来实现daemon
    exit(1);
  }

 fp = fopen(FNAME,"w"); 
 if(fp == NULL){
   perror("");
   exit(1);
 }


  //做任务，目的是不间断每秒钟往终端打印一个数字
 for(int i = 0; ; i++){
   fprintf(fp,"%d",i);
   sleep(1);
 }






  exit(0);
}
