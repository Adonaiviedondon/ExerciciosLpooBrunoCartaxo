package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ProdutoMes {
       public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double[]preco=new double[12];
		double total = 0;
	    for (int i = 0; i < preco.length; i++) {
			System.out.printf("digite o preco no mes %d:",i+1);
			preco[i]=leitor.nextDouble();
		}
	    for (int i = 0; i < preco.length; i++) {
			total+=preco[i];
		}
	    System.out.printf("a media de preco eh %f",total/12);
	}
}
