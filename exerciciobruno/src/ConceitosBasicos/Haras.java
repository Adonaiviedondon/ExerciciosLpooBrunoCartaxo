package ConceitosBasicos;

import java.util.Scanner;

public class Haras {
	public static void main(String[] args) {
		Scanner cavalo = new Scanner(System.in);
		System.out.print("digite o numero de cavalos no  haras:");
		int ferraduras = cavalo.nextInt();
		System.out.println("o numero de ferraduras serem compradas é"+ 4*ferraduras);
	}

}
