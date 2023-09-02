package ConceitosBasicos;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
    	Scanner tempo = new Scanner(System.in);
		System.out.print("digite o numero de horas trabalhadas no mes:");
		int horas = tempo.nextInt();
		System.out.print("digite o quanto o funcionario ganha por cada hora:");
		double valor = tempo.nextDouble();
		double salario = horas * valor;
		System.out.println("o salario total do funcionario é"+ salario);
		
	}
}
