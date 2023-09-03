package EstruturadeDecisao;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("digite o primeiro numero:");
		double numero1 = leitor.nextDouble();
		System.out.print("digite o segundo numero:");
		double numero2 = leitor.nextDouble();
		if(numero1>numero2) {
			System.out.println("o maior numero eh "+numero1);
		}
		else if(numero2>numero1){
			System.out.println("o maior numero eh "+numero2);
		}
		else {
			System.out.println("os numeros sao iguais");
		}
	}

}
