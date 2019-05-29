#include<stdio.h>
int main()
{
  int num,a;
   scanf("%d",&a);
  num=a%10;
  int num1=a/10;
  int sum=num+num1;
  printf("%d",sum);
  return 0;
}