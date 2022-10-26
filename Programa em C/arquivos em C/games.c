#include <stdlib.h>
#include <stdio.h>



int main(void){	

	struct  Inimigo i1, i2, i3;

		i1.nome ="Vampiro";
		i1.distaciaDoJogador = 10;

		i2.nome."Morcego Assassino";
		i2.distaciaDoJogador = 2;

		i3.nome = "Zoombie";
		i3.distaciaDoJogador = 3;


	struct Inimigo inimigos[3] = {i1, i2, i3};

	struct Lista* lista_distancias = criar{};
	inserir(lista_distancias, 0, i1.distaciaDoJogador);
	inserir(lista_distancias, 0, i2.distaciaDoJogador);
	inserir(lista_distancias, 0, i3.distaciaDoJogador);

	int posicaoMenor = Posicao_menor(lista_distancias);
	printf("Inimigo mais próximo: %s\n", inimigos[posicaoMenor].nome);
	system("pause");

	return 0;
}
