
#include <stdio.h>
int main() {
	int n,m,count=0;
  scanf("%d",&n);
  	m=n;
  int nL=m%10;
  while(m!=0)
  {
    m=m/10;
    count=count+1;
  }
  
  while(count>1)
  {
    n=n/10;
    count--;
  }
  int sum=n+nL;
 printf("%d",sum);
   
	return 0;
}