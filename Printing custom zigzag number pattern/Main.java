#include <stdio.h>
int main() {
int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    int num=i;
    if (i%2==0)
    {
      for(int k=1;k<=n;k++)
      {
        if (k==1)
        printf("%d",i+1);
          else
            printf("%d",i);
      }printf("\n");
    }
    else
    {
    for(int j=1;j<=n;j++)
    {
      if (j==n)
        printf("%d",++num);
      else
    printf("%d",i);
     
    }
    printf("\n");
  }
  }
	return 0;
}