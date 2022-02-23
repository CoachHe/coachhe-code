#include <stdio.h>
void function1(int choice){
  printf("输入了%d，运行了function1函数。\n", choice);
}
void function2(int choice){
  printf("输入了%d，运行了function2函数。\n", choice);
}
void function3(int choice){
  printf("输入了%d，运行了function3函数。\n", choice);
}
int main(){
  void (*f[3])(int)={function1,function2,function3};
  int choice;
  printf("输入一个数：范围[0-2]: ");
  scanf("%d",&choice);
  while(choice >= 0 && choice < 3){
    (*f[choice])(choice);     //f[choice][choice]
    printf("输入一个数：范围[0-2]: ");
    scanf("%d",&choice);
  }
  printf("程序运行结束。");
  return 0;
}
