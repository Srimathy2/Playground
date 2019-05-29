#include <stdio.h>
int main() {
	int n,count=0;
  scanf("%d",&n);
	int i=0;
    while(count!=n)
    {
        if (i%2!=0)
        {
            printf("%d",i);
          printf("\n");
           count++;
        }
       i++;
       
    }

 
   
	return 0;
}