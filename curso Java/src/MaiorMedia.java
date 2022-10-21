import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
       
        int number;
        int count = 0;
        int bigger = 0;
        int average = 0;

        do{
            System.out.println("Enter a number: "); 
            number = inputReader.nextInt();
            average = average + number;
            if (number > bigger) bigger = number;
            count++;

        }while(count < 5);

        System.out.println("finally of Process");
        System.out.println("bigger number: "+ bigger);
        System.out.println("number of average: "+ (average/5));

                   

    }

}