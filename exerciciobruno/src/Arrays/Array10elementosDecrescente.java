package Arrays;


import java.util.Scanner;

public class Array10elementosDecrescente {
        public static void main(String[] args) {
			Scanner	leitor = new Scanner(System.in);
		
			double [] arrayDecrescente = new double[10];
			for (int i=0; i<10;i++) {
				System.out.printf("digite o elemento %d :",(i));
				arrayDecrescente[i]=leitor.nextDouble();
				
			}
			for (int i = 9; i >= 0; i--) {
				System.out.print(arrayDecrescente[i]+" ");
			}
		
	}
}
