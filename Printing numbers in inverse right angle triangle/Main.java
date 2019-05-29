#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  		for(int i=n;i>0;i--)
    {int num=i;
      for(int k=i;k>i;k--)
        printf(" ");
      for(int j=1;j<=i;j++)
      {
        printf("%d",num);
        num--;
      }
      printf("\n");
    }	
 
return 0;
}