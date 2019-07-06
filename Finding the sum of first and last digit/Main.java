#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  	int num,count=0;
	scanf("%d",&num);
  	int udigit = num%10;
  	while(num>10)
    {
      	num/=10;
    }
  printf("%d",udigit+num);
}