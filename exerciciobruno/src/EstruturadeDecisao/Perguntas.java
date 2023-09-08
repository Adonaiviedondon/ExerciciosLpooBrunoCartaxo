package EstruturadeDecisao;

import java.util.Scanner;

public class Perguntas {
	private static Boolean True;
	private static int resposta;

	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		int respostas = 0;
	
		System.out.print("Telefonou para a vítima?");
		Boolean pergunta1=leitor.nextBoolean();
		if(pergunta1 == True) {
			respostas++;
			}
		System.out.print("Esteve no local do crime?");
		Boolean pergunta2=leitor.nextBoolean();
		if(pergunta2 == True) {
			respostas++;
			}
		System.out.print("Mora perto da vítima?");
		Boolean pergunta3=leitor.nextBoolean();
		if(pergunta3 == True) {
			respostas++;
			}
		System.out.print("Devia para a vítima?");
		Boolean pergunta4=leitor.nextBoolean();
		if(pergunta4 == True) {
			respostas++;
			}

		System.out.print("Já trabalhou com a vítima?");
		Boolean pergunta5=leitor.nextBoolean();
		if(pergunta5 == True) {
			respostas++;
			}
		if(respostas==5) {
			System.out.println("depoente:assassino");
		}
		else if(respostas==4 ||respostas==3) {
			System.out.println("depoente:cumplice");
		}
		else if(respostas==2) {
			System.out.println("depoente:suspeito");
		}
		else {
			System.out.println("depoente:inocente");
		}
		
	}

}
