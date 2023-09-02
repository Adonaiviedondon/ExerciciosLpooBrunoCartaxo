package ConceitosBasicos;

import java.util.Scanner;

public class NumeroInformado {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("digite um numero");
		double numero1 = leitor.nextDouble();
		System.out.println("o numero digitado foi"+ numero1);
	}

}
