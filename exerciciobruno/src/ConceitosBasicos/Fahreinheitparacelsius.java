package ConceitosBasicos;

import java.util.Scanner;

public class Fahreinheitparacelsius {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.print("digite a temperatura em fahreinheit:");
		double temp = leitor.nextDouble();
		double celsius =(5*(temp-32)/9);
		System.out.printf("temperatura em celsius é %.2f",(celsius));
	}

}
