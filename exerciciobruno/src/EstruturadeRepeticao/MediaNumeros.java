package EstruturadeRepeticao;

import java.util.Scanner;

public class MediaNumeros {
          public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			double soma=0;
			double contador=0;
			while(contador<100) {
				System.out.print("digite um numero:");
				double numeroatual = leitor.nextDouble();
				soma+=numeroatual;
				contador++;
			}
			System.out.printf("a media dos numeros eh %f",(soma/contador));
		}
}
