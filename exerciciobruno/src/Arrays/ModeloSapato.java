package Arrays;

import java.util.Scanner;

public class ModeloSapato {
      public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double[]Modelo=new double[50];
		for (int i = 0; i < Modelo.length; i++) {
			System.out.printf("digite o preco do modelo %d:",i+1);
		    Modelo[i]=leitor.nextDouble();
		}
		for (int i = 0; i < Modelo.length; i++) {
			System.out.printf("o valor a vista do modelo %d eh %f%n",i+1,Modelo[i]*0.95);
			System.out.printf("o valor no cartao do modelo %d eh %f%n",i+1,Modelo[i]*1.05);
		}
	}
}
