#include<stdio.h>
void minimum(int n1,int n2,int n3,int m)
  {
  if (n1 % m==0 && n2 % m==0 && n3 % m==0)
  {    printf("%d",m);}
  else
  {
   int  min=m-1;
    minimum(n1,n2,n3,min);
  }
}
int gcd(int n1,int n2,int n3)
{ 
  int min=0;
  if (n1<n2)
  { min=n1;}
    else if (n2<n3)
    { min=n2;}
  else
  {min=n3;}
  minimum(n1,n2,n3,min);
}

int main()
{
int num1,num2,num3;
  scanf("%d",&num1);
    scanf("%d",&num2);
    scanf("%d",&num3);
  gcd(num1,num2,num3);
  return 0;
}