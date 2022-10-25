import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        System.out.print(nomes.length);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {

            System.out.println("Please enter a number: ");
           String s = br.readLine();
            int i = Integer.parseInt(s);

            System.out.println("Your entered number was: "+i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        br.close();

    }
}