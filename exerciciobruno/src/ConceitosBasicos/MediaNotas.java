package ConceitosBasicos;

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner Valor = new Scanner(System.in);
		System.out.print("digite a primeira nota:");
		double nota1=Valor.nextDouble();
		System.out.print("digite a segunda nota:");
		double nota2=Valor.nextDouble();
		System.out.print("digite a terceira nota:");
		double nota3=Valor.nextDouble();
		System.out.print("digite a quarta nota:");
		double nota4=Valor.nextDouble();
		double soma = nota1+nota2+nota3+nota4;
		double media = soma/4;
		System.out.println("a media das 4 provas é :"+media);
		
	}

}
