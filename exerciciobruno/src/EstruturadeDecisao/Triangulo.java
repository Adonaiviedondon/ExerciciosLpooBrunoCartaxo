package EstruturadeDecisao;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		double lado1 =0.0;
		double lado2 =0.0;
		double lado3 =0.0;
		Scanner leitor = new Scanner(System.in);
		System.out.print("digite o lado 1");
		
		System.out.print("digite o lado 2");
		double lado2 = leitor.nextDouble();
		System.out.print("digite o lado 3");
		double lado3 = leitor.nextDouble();
		while((lado1+lado2)<lado3||(lado1+lado3)<lado2||(lado2+lado3)<lado1) {
			System.out.println("valores invalidos");
			System.out.print("digite o lado 1");
			double lado1 = leitor.nextDouble();
			System.out.print("digite o lado 2");
			double lado2 = leitor.nextDouble();
			System.out.print("digite o lado 3");
			double lado3 = leitor.nextDouble();
		}
		
	}

}
