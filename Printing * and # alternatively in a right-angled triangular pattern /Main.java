#include <stdio.h>
int main(){
	int n;
  scanf("%d",&n);
  printf("*");
  printf("\n");
  for(int i=2;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if (i==4 || i==5)
      {
         if (j%2!=0)
        printf("*");
      else
        printf("#");
      }
      else
      {
      if (j%2!=0)
        printf("#");
      else
        printf("*");
      }
    }
    printf("\n");
  }
  	return 0;
}