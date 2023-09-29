package Arrays;

import java.util.Scanner;

public class Array5numeros {
       public static void main(String[] args) {
		Scanner leitor =new Scanner(System.in);
		int[]array=new int[5];
		for(int i=0;i<array.length;i++) {
			System.out.printf("digite o valor do elemento do array na posicao %d:",(i));
			array[i]=leitor.nextInt();
			
	}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
		}
		
}
}
