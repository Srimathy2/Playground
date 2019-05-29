#include<stdio.h>
void greatest (int a,int b,int c)
{
  if (a>b&&a>c)
  {
    printf("%d",a);
  }
  else if (b>c &&b>a)
  {
     printf("%d",b);
  }
  else
  {
     printf("%d",c);
  }
}
int main()
{
  int n1,n2,n3;
  scanf("%d",&n1);
  scanf("%d",&n2);
  scanf("%d",&n3);
  greatest(n1,n2,n3);
}
