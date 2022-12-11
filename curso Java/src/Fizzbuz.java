import java.util.*;

public class Fizzbuz {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

       int  num = numero.nextInt();

        fizzbuz(num);
        
     
      
      
      
    }

    static void fizzbuz(int num) {
        for (int i = num; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizzbuzz");
                break;
            }else if(i % 5 == 0){
                System.out.println("Buzz");
                break;
            }else if(i % 3 == 0){
                System.out.println("Fizz");
                break;
            }else{
                System.out.println(i);
                break;
            }
        }
    }
         
}