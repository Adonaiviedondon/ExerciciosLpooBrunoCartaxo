package Arrays;

import java.util.Scanner;

public class Array30Impares {
   public static void main(String[] args) {
	Scanner leitor=new Scanner(System.in);
	int[]array=new int[30];
	for (int i = 0; i < array.length; i++) {
		System.out.printf("digite o elemento %d:",(i));
		array[i]=leitor.nextInt();
	}
	for (int i = 0; i < array.length; i++) {
		if (i%2==1) {
			System.out.print(array[i]+" ");
		}
	}
}
}
