#include <stdio.h>
#include <stdlib.h>

int main(){	
	int contador, programador;
	

	for(contador = 0; contador <= 3; contador++){
		printf("\n Voce ja Programar (1 = sim)(0 = nao): ");
		scanf("%d", &programador);
		if(programador >= 1)
			printf("\n Ola Mundo!");
		else
		
			printf("\n Meu Primeiro Programa em C.\n");
	
	}
	system("pause");

	return 0;
}
