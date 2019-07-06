#include<stdio.h>
#define greater(a,b) a>b?"num1 is the greatest":"num2 is the greatest"
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  printf("%s",greater(a,b));
  return 0;
}