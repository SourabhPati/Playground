#include <stdio.h>
int main() {
	//Type your code
   	int num;
  	scanf("%d",&num);
  	for(int i=0,j=1;i<num;++i,j+=2)
      printf("%d\n",j);
	return 0;
}