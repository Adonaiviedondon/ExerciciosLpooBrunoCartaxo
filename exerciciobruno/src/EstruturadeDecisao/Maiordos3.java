package EstruturadeDecisao;

import java.util.Scanner;

public class Maiordos3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("digite o primeiro numero:");
		double numero1 = leitor.nextDouble();
		System.out.print("digite o segundo numero:");
		double numero2 = leitor.nextDouble();
		System.out.print("digite o terceiro numero:");
		double numero3 = leitor.nextDouble();
		if((numero1>numero2 && numero1>numero3)||(numero1==numero2 && numero1>numero3)||(numero1>numero2 && numero1==numero3)) {
			System.out.println("o maior numero eh"+numero1);
		}
		else if((numero2>numero1 && numero2>numero3)||(numero1==numero2 && numero2>numero3)||(numero2>numero1 && numero2==numero3)) {
			System.out.println("o maior numero eh"+numero2);
		}
		else if((numero3>numero1 && numero3>numero2)||(numero3==numero1 && numero3>numero2)||(numero3>numero1 && numero3==numero2)) {
			System.out.println("o maior numero eh"+numero3);
		}
		else {
			System.out.println("os tres numeros sao iguais e eh"+numero1);
		}
		
		

	}
}
