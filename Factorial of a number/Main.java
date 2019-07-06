#include <stdio.h>
int main() {
	//Type your code
  	int num;
  	scanf("%d",&num);
   printf("%d",fact(num));
	return 0;
 
}
int fact(int num)
{
  	if(num<2)
    	return 1;
  	return num*fact(num-1);
}