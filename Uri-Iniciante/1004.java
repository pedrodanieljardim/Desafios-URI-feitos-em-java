import java.io.IOException;
import java.util.Scanner;

/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD. 
A seguir mostre a vari�vel PROD com mensagem correspondente.   
*/

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int PROD = A*B;
		System.out.println("PROD = "+PROD);
		sc.close();
	}

}
