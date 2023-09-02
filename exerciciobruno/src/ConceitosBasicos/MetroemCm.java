package ConceitosBasicos;

import java.util.Scanner;

public class MetroemCm {
	public static void main(String[] args) {
		Scanner medida = new Scanner(System.in);
		System.out.print("digite o valor em metros:");
		double valor = medida.nextDouble();
		System.out.println("o valor em centimetros é"+100*valor);
		
	}

}
