package EstruturadeDecisao;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		double salario =0;
		Scanner valor = new Scanner(System.in);
		
		while(salario<=0) {
            System.out.print("digite o salario do funcionario:");
			salario=valor.nextDouble();
			if(salario<0) {
				System.out.println("valor invalido");
			}
			
		}
		
		if(salario <=280) {
			double salarioantigo=salario;
			System.out.printf("o salario anterior era %.2f%n",(salarioantigo));
			salario*=1.2;
			System.out.printf("o salario novo eh %.2f%n",(salario));
			System.out.printf("valor do aumento eh %.2f%n",(salario-salarioantigo));
			System.out.println("percentual de aumento eh de 20%");
		}
		else if(salario > 280 && salario <=700) {
			double salarioantigo=salario;
			System.out.printf("o salario anterior era %.2f%n",(salarioantigo));
			salario*=1.15;
			System.out.printf("o salario novo eh %.2f%n",(salario));
			System.out.printf("valor do aumento eh %.2f%n",(salario-salarioantigo));
			System.out.println("percentual de aumento eh de 15%");
		}
		else if(salario >700 && salario<=1500) {
			double salarioantigo=salario;
			System.out.printf("o salario anterior era %.2f%n",(salarioantigo));
			salario*=1.1;
			System.out.printf("o salario novo eh %.2f%n",(salario));
			System.out.printf("valor do aumento eh %.2f%n",(salario-salarioantigo));
			System.out.println("percentual de aumento eh de 10%");
		}
		else {
			double salarioantigo=salario;
			System.out.printf("o salario anterior era %.2f%n",(salarioantigo));
			salario*=1.05;
			System.out.printf("o salario novo eh %.2f%n",(salario));
			System.out.printf("valor do aumento eh %.2f%n",(salario-salarioantigo));
			System.out.println("percentual de aumento eh de 5%");
			
		}
		
		
		

}
}
