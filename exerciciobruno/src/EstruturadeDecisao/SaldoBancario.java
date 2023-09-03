package EstruturadeDecisao;

import java.util.Scanner;

public class SaldoBancario {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.print("digite seu saldo atual:");
		double saldo = valor.nextDouble();
		System.out.print("digite o total de credito:");
		double credito = valor.nextDouble();
		System.out.print("digite o total de debitos:");
		double debito = valor.nextDouble();
		double saldoatual = saldo + credito - debito;
		if (saldoatual > 0) {
			System.out.printf("saldo positivo em %.2f", (saldoatual));
		} else if (saldoatual < 0) {
			System.out.printf("saldo negativo em %.2f", (saldoatual));
		}
		else {
			System.out.printf("saldo zero");
		}

	}

}
