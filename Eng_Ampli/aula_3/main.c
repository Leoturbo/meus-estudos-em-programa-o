#include <stdio.h>
//exercicio unidade 02
int main() {
    float salario_bruto, desc_inss, desc_ir, salario_liquido, salub;
    float proc = 100;
    
    
    printf("\n\n C�lculo de Sal�rio L�quido com desconto do IR e INSS");
    printf("\n Digite seu sal�rio bruto: ");
    scanf("%f", &salario_bruto);
    
    // C�lculo do desconto do INSS
    if (salario_bruto <= 1045.0) {
        desc_inss = salario_bruto * 0.075;
    } else if (salario_bruto <= 2089.60) {
        desc_inss = salario_bruto * ((float) 9 / (float) 100);
    } else if (salario_bruto <= 3134.40) {
        desc_inss = salario_bruto * 0.12;
    } else {
        desc_inss = salario_bruto * 0.14;
    }
    
    
    
    // C�lculo do desconto do IR
    if (salario_bruto <= 1903.98) {
        desc_ir = 0;
    } else if (salario_bruto <= 2826.65) {
        desc_ir = salario_bruto * 0.075;
    } else if (salario_bruto <= 3751.05) {
        desc_ir = salario_bruto * 0.15;
    } else if (salario_bruto <= 4664.68) {
        desc_ir = salario_bruto * 0.225;
    } else {
        desc_ir = salario_bruto * 0.275;
    }

	// C�lculo do salario 
	salub = 1215*(proc/cons);
    salario_liquido = salub+(salario_bruto - desc_inss - desc_ir);
    
    printf( "\n Desconto INSS: R$ %.2f", desc_inss);
    printf( "\n Desconto IR: R$ %.2f", desc_ir);
    printf( "\n Sal�rio l�quido: R$ %.2f", salario_liquido);

    return 0;
}

