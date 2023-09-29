package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Maior500 {
   public static void main(String[] args) {
	Scanner leitor =new Scanner(System.in);
	double[]array=new double[500];
	double maior=0;
	for (int i = 0; i < array.length; i++) {
		System.out.printf("digite o elemento na posicao %d:",(i));
		array[i]=leitor.nextDouble();
	}
	for (int i = 0; i < array.length; i++) {
		if (i==0||array[i]>maior) {
			maior=array[i];
		}	
	}
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]/maior+" ");
	}
  }
}
