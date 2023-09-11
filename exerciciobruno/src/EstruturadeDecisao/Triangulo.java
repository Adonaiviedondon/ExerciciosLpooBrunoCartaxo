package EstruturadeDecisao;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
			System.out.print("digite o lado 1:");
			double lado_1 = leitor.nextDouble();
			System.out.print("digite o lado 2:");
			double lado_2 = leitor.nextDouble();
			System.out.print("digite o lado 3:");
			double lado_3 = leitor.nextDouble();
		if((lado_1+lado_2)<lado_3||(lado_1+lado_3)<lado_2||(lado_2+lado_3)<lado_1) {
			System.out.println("lados nao formam triangulo");
		}
		else if(lado_1==lado_2 && lado_1==lado_2 && lado_2==lado_3) {
			System.out.println("triangulo equilatero");
		}
		else if((lado_1==lado_2 && lado_1 !=lado_3)||(lado_1==lado_3 && lado_1 !=lado_2)||(lado_2==lado_3 && lado_1 !=lado_2)) {
			System.out.println("triangulo escaleno");
		}
		else {
			System.out.println("triangulo escaleno");
		}
		
			
		
		
	}

}
