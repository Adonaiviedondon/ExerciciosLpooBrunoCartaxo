package Arrays;

import java.util.Scanner;

public class Pedagio {
       public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[]setembro=new int[30];
		int maior=0;
		int dia=0;
		for (int i = 0; i < setembro.length; i++) {
			System.out.printf("digite o numero de carros no dia %d:",(i+1));
			setembro[i]=leitor.nextInt();
		}
		for (int i = 0; i < setembro.length; i++) {
			if(i==0||setembro[i]>=maior) {
				maior=setembro[i];
				dia=i+1;
			}
		}
		System.out.printf("o maior volume de carros eh %d do dia %d",maior,dia);
	}
}
