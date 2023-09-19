package EstruturadeRepeticao;

import java.util.Scanner;

public class MaiorNumero {
       public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double maiornumero = 0;
		double numero;
		for(numero=0;numero<50;numero++) {
			System.out.print("digite um numero:");
			double numeroatual = leitor.nextDouble();
			if(numero==0||numeroatual>maiornumero) {
				maiornumero=numeroatual;
			}
		}
		System.out.printf("maiornumero eh %f",(maiornumero));
	}
}
