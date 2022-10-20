#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int contador;
	float salub = 0;

	printf("\n %2.f", salub);
	
	printf("\n Digite um valor: ");
	scanf("%d", &contador);
	
	for(contador; contador <= 100; contador++)
	{
		printf("%d ", contador);
	}
	return 0;
}	
