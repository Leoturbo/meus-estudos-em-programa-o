import java.io.IOException;
import java.util.Scanner;

public class somadoMultiplos {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int x = 3;
    int z = 18;
    int res = 0;



    for(int i = x; i < z+x; i++){
        if(i % x == 0 || i % z == 0){
         
            res += i;
            System.out.println(res);
        }
    }

    System.out.println("A soma dos multiplos de 3 e z abaixo de z, é: " +res);
}}