#include <iostream>
using namespace std;


int main(){
  
  int a = 12;
  int *b = &a;
  int **c = &b;
  
  cout << b << endl;
  cout << c << endl;

  return 0;
}
