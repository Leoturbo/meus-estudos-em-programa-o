#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
float t1, t2;
float calcularMedia(){
		return (t1+t2)/2;
	}
int main(int argc, char *argv[]) {
	printf("\n Digite as duas temperaturas: ");
	scanf("%f %f",&t1,&t2);
	print("\n A temperatura media =%.2f",calcularMedia());
	
	
	return 0;
}
