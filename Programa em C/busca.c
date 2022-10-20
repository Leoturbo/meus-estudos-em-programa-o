# include <stdio.h>
# define MAX 200

int main()
{
	int i, n, m=0, esta;
	float sacola[MAX], x;

	printf("Entre com 0 < n < 200: \n");
	scanf("%d", &n);

	for (i = 0; i < n; ++i)
	{
		printf("Entre com o elemento %d: ", i);
		scanf("%f", &x);
		esta = acha(sacola, m, x);
		if(esta == -1){
			insere(sacola, &m, x);
		}
	}

	for (i = 0; i < m; ++i){
	
		printf("%f\n", sacola[i] );
	}
	return 0;
}