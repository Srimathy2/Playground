#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int a=num%100;
  int b=a/10;
  printf("%d",b);  
  return 0;
}