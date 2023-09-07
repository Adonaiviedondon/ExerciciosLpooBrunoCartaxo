package EstruturadeDecisao;

import java.util.Scanner;

public class Ingresso {
    public static void main(String[] args) {
        int diadasemana = 0;
        int idade = 0;
        double ingresso = 0.0;

        Scanner leitor = new Scanner(System.in);
        while (diadasemana < 1 || diadasemana > 7) {
            System.out.print("Digite um número do dia da semana : ");
            diadasemana = leitor.nextInt();

            if (diadasemana < 1 || diadasemana > 7) {
                System.out.println("numeroinvalido");
            }
        }

        System.out.print("Digite a idade do telespectador: ");
        idade = leitor.nextInt();
        System.out.print("Digite o valor do ingresso: ");
        ingresso = leitor.nextDouble();

        switch (diadasemana) {
            case 1:
                System.out.println("Dia da semana: Domingo");
                System.out.println("Idade: " + idade);
                System.out.println("Valor a pagar: " + ingresso);
                break;
            case 2:
                System.out.println("Dia da semana: Segunda");
                System.out.println("Idade: " + idade);
                System.out.println("Valor a pagar: " + ingresso);
                break;
            case 3:
                System.out.println("Dia da semana: Terça");
                if (idade < 14) {
                	System.out.println("Idade: " + idade);
                	System.out.println("Valor a pagar: " + ingresso/2);
                }
                break;
            case 4:
                System.out.println("Dia da semana: Quarta");
                System.out.println("Idade: " + idade);
            	System.out.println("Valor a pagar: " + ingresso);
                break;
            case 5:
                System.out.println("Dia da semana: Quinta");
                System.out.println("Idade: " + idade);
            	System.out.println("Valor a pagar: " + ingresso);
                break;
            case 6:
                System.out.println("Dia da semana: Sexta");
                System.out.println("Idade: " + idade);
            	System.out.println("Valor a pagar: " + ingresso);
                break;
            case 7:
                System.out.println("Dia da semana: Sábado");
                System.out.println("Idade: " + idade);
            	System.out.println("Valor a pagar: " + ingresso);
                break;
        }

        
    }
}
