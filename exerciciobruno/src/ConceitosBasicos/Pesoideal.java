package ConceitosBasicos;

import java.util.Scanner;

public class Pesoideal {
	public static void main(String[] args) {
		Scanner peso = new Scanner(System.in);
		System.out.print("digite sua altura:");
		double altura = peso.nextDouble();
		double pesoideal = (72.7*altura)-58;
		System.out.printf("o peso ideal que precisa ter com essa altura é %.2f",(pesoideal));
	}

}
