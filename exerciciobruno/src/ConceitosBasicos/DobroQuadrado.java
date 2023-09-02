package ConceitosBasicos;

import java.util.Scanner;

public class DobroQuadrado {
	public static void main(String[] args) {
		Scanner quadrado = new Scanner(System.in);
		System.out.print("digite o lado do quadrado :");
		double lado = quadrado.nextDouble();
		System.out.println("o dobro da area é"+(lado*lado)*2);
	}

}
