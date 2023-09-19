package EstruturadeRepeticao;

import java.util.Scanner;

public class NumerosEntre {
   public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int i;
	System.out.print("digite o primeiro numero:");
	int numero1 = leitor.nextInt();
	System.out.print("digite o segundo numero:");
	int numero2 = leitor.nextInt();
	if(numero1<numero2) {
		for(i=numero1+1;i<numero2;i++) {
			System.out.println(i);
		}
	}
	else {
		for(i=numero2+1;i<numero1;i++) {
			System.out.println(i);
		}
	}
	
}
}
