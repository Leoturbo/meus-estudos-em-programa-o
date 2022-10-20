import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
	public static void main(String[] args){

		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite seu nome");
		String nome = terminal.next();

		System.out.println("Digite seu sobrenome");
		String sobrenome = terminal.next();

		System.out.println("Digite sua idade");
		int idade = terminal.nextInt();

		System.out.println("Digite sua altura");
		double altura = terminal.nextDouble();



		System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura é " + altura + "cm");
		System.out.println("Oi, fui executado pelo Terminal");
	}
}