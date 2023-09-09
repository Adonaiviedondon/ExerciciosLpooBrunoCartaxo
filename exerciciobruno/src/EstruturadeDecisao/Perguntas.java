package EstruturadeDecisao;

import java.util.Scanner;

public class Perguntas {
	
	

	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		int respostas = 0;
	
		System.out.print("Telefonou para a vítima?");
		Boolean pergunta1=leitor.nextBoolean();
		System.out.print("Esteve no local do crime?");
		Boolean pergunta2=leitor.nextBoolean();
		System.out.print("Mora perto da vítima?");
		Boolean pergunta3=leitor.nextBoolean();
		System.out.print("Devia para a vítima?");
		Boolean pergunta4=leitor.nextBoolean();
		System.out.print("Já trabalhou com a vítima?");
		Boolean pergunta5=leitor.nextBoolean();
		if(pergunta1 == true) {
			respostas++;
			}
		if(pergunta2 == true) {
			respostas++;
			}
		if(pergunta3 == true) {
			respostas++;
			}
		if(pergunta4 == true) {
			respostas++;
			}

		if(pergunta5 == true) {
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
