package EstruturadeDecisao;

import java.util.Scanner;

public class Ingresso {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("digite um numero do dia da semana");
		int diadasemana = leitor.nextInt();
		System.out.print("digite a idade do telespectador");
		int idade = leitor.nextInt();
		System.out.print("digite o valor do ingresso");
		double ingresso = leitor.nextDouble();
		if (diadasemana < 1 || diadasemana > 7) {
			System.out.print("digite um numero do dia da semana");
			int diadasemana1 = leitor.nextInt();
		}
		if (1 <= diadasemana && diadasemana <= 7) {

			switch (diadasemana) {
			case 1:
				System.out.println("idade:" + idade);
				System.out.println("valor a pagar:" + ingresso);
				System.out.println("dia da semana:Domingo");
				break;
			case 2:
				System.out.println("idade:" + idade);
				System.out.println("valor a pagar:" + ingresso);
				System.out.println("dia da semana:Segunda");
				break;
				
			case 3:
				if (idade < 14) {
					System.out.println("idade:" + idade);
					System.out.println("valor a pagar:" + (ingresso/2));
					System.out.println("dia da semana:Terça");
					break;
				}
				else {
					System.out.println("idade:" + idade);
					System.out.println("valor a pagar:" + (ingresso));
					System.out.println("dia da semana:Terça");
					break;
				}
			case 4:
				System.out.println("idade:" + idade);
				System.out.println("valor a pagar:" + ingresso);
				System.out.println("dia da semana:Quarta");
				break;
			case 5:
				System.out.println("idade:" + idade);
				System.out.println("valor a pagar:" + ingresso);
				System.out.println("dia da semana:Quinta");
				break;
			case 6:
				System.out.println("idade:" + idade);
				System.out.println("valor a pagar:" + ingresso);
				System.out.println("dia da semana:Sexta");
				break;
			case 7:
				System.out.println("idade:" + idade);
				System.out.println("valor a pagar:" + ingresso);
				System.out.println("dia da semana:Sabado");
				break;
				}
	     else {
				
			}
			}
		}
	

	}
