package ConceitosBasicos;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("digite o primeiro numero:");
		double numero1 = leitor.nextDouble();
		System.out.print("digite o segundo numero:");
		double numero2 = leitor.nextDouble();
		double valor = numero1 + numero2;
		System.out.println("o resultado da soma é "+valor);
	}

}
