#include <stdio.h>
char *getWord(char c){
   switch(c){
      case 'A': return "Apple";
      case 'B': return "Banana";
      case 'C': return "Cat";
      case 'D': return "Dog";
      default: return "None";
   }
}

int main(){
   char input;
   printf("Please input a character:");
   input = getchar();
   printf("%c\n",input);
   printf("%s\n",getWord(input));
   getchar();
   return 0;
}
