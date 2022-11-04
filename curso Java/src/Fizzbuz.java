import java.util.*;

public class Fizzbuz {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

       int  num = numero.nextInt();

        fizzbuz(3);
        
     
      
      
      
    }

    static void fizzbuz(int num) {
        for (int i = num; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizzbuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
         
}