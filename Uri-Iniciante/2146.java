import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/* um objeto BufferedReader e chame o m�todo readLine() at� que ele retorne null. 
          Lembrando que o m�todo readLine() da classe BufferedReader() retorna uma String.
          E como no seu exerc�cio voc� est� lidando com um n�mero,
		 basta converter a String para int.
	*/

        String linha;

        while ((linha = br.readLine()) != null) {
            int n = Integer.parseInt(linha);
            System.out.println(n-1);
        }
		sc.close();
	}

}