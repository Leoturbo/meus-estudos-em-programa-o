import java.util.Scanner;

public class ParEImpar {
	public static void main(String args[])  {

		Scanner scan = new Scanner (System.in);

		int number;
		System.out.println("Quantidade de números: ");
		number = scan.nextInt();
		int count, numberPar, numberImpares = 0;

		do{
			System.out.println("Number: ");
			number = scan.nextInt();
			if(number % 2 == 0) numberPar++;
			else numberImpares++;
			count++;


		}while(count < number);

		System.out.println("Quantidade de Par: "+ numberPar);
		System.out.println("Quantidade de Impares: "+ numberImpares);

		
	}
}