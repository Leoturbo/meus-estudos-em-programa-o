#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define NOME_TAM 30

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char nome[NOME_TAM];
    int i;
    printf("\nDigite o nome do(a) aluno(a):");
    fgets(nome, NOME_TAM, stdin);
    printf("\nNome ANTES da mudança: %s", nome);
    
    for(i = 0; i < NOME_TAM; i++) {
        nome[i] = toupper(nome[i]);
    }
    
    printf("\nNome DEPOIS da mudança: %s", nome);
    return 0;
}
