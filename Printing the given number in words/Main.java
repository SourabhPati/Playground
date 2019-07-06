#include<stdio.h>
int main()
{
 
  char *p[5] = {"One","Two","Three","Four","Five"};
  int num;
  scanf("%d",&num);
  if(num>5 || num<1)
    printf("Invalid");
  else
   	printf("%s",p[num-1]);
  return 0;
}