package Arrays;

import java.util.Scanner;

public class AlturaIdade5 {
       public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		Scanner leitor1= new Scanner(System.in);
		double[]altura=new double[5];
		int[]idade=new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("digitando a idade da pessoa :");
			idade[i]=leitor.nextInt();
			System.out.print("digitando a altura da pessoa :");
			altura[i]=leitor1.nextDouble();
		}
		for (int i = 4; i >= 0; i--) {
			System.out.print(altura[i]+" ");
		}
		for (int i = 4; i >= 0; i--) {
			System.out.print(idade[i]+" ");
		}
	}
}
