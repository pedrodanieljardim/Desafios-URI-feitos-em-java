import java.util.Scanner;
//Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � vari�vel SOMA.
// A seguir escrever o valor desta vari�vel.
public class 1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,SOMA;
		A= sc.nextInt();
		B= sc.nextInt();
		SOMA = A+B;
		System.out.println("SOMA = "+SOMA);
		sc.close();
	}

}
