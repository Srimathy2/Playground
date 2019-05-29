#include <stdio.h>
int main() {
	int n;
  int count=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    printf("%d",i);
    count++;
    if (count==3)
    {
      count=0;
      printf(",");
    }
  }
	return 0;
}