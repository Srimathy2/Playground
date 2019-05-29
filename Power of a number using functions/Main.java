#include<stdio.h>
#include<math.h>
int power(int b,int e)
{
  int ans;
  ans=pow(b,e);
  return ans;
}
int main(){
  int num1,num2;
  scanf("%d %d",&num1,&num2);
    int ans=power(num1,num2);
  printf("%d",ans);
}
  
  	