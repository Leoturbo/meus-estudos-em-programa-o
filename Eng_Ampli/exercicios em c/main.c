#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int matriz[3][3];
	
	for(linha=0; linha<3; linha++)
	{
		for(coluna=0; coluna<3; coluna++)
		{
			printf("Digite os valores de matris para: linha %d, coluna %d ", linha+1, coluna+1);
			
			scanf("%d", &matriz[linha][coluna]);
		}
	}
	return 0;
}
