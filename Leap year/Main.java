#include<stdio.h>
int main()
{
  //Type your code here
  int year;
  scanf("%d",&year);
  printf("%s",year%4==0?"Leap year":"Not Leap year");
  return 0;
}