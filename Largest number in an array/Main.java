#include<stdio.h>
int main()
{
 int s,r;
  scanf("%d",&s);
  int arr[s];

   
  for (int i=0;i<s;i++)
  {
    scanf("%d",&arr[i]);
  }
    int large=arr[0];
    
  for (int i=0;i<s;i++)
  {
    if (large<arr[i])
        {
      large=arr[i];
      
        
        }
  
        }
    printf("%d",large);
  return 0;
}