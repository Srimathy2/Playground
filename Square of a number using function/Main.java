#include<stdio.h>
#include<math.h>
int square(int num)
{
  int ss=num*num;
  return ss;
}
int main() {
  	int n;
  scanf("%d",&n);
  int s=square(n);
  printf("%d",s);
   return 0;
}