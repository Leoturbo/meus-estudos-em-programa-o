// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        buscar();

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
        static void buscar(int[] elementos){
          for(int i = 0; i < elementos.length; i++){
            if (i == elementos[i]){
                System.out.println("Achei %d na posicao %d ", i, );
                break;
            }

          }    
                
            }else{
                System.out.println("Numero %d nao encontrado!", i);
                break;
            

    }
}