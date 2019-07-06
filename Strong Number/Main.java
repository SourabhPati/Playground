#include <stdio.h>
int main() {
	//Type your code
  int num;
  	scanf("%d",&num);
  int sum=0,temp=num;
  while(temp)
  {
    sum += fact(temp%10);
    temp/=10;
  }
  if(sum==num)
    printf("Yes");
  else
    printf("No");
	return 0;
}
int fact(int num)
{
  	if(num<2)
    	return 1;
  	return num*fact(num-1);
}