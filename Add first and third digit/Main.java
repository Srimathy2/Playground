#include<stdio.h>
int main()
{
  int b,a,num;
  scanf("%d",&num);
  a=num/100;
  b=num%10;
  int sum=a+b;
   printf("%d",sum);
  return 0;
}