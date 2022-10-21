import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Digite a Nota: ");
        int number = inputReader.nextInt();

        while(number < 0 | number > 10){

            System.out.println("Nota invalida! Digite novamente: ");
            number = inputReader.nextInt();        


        }

            
    }

}