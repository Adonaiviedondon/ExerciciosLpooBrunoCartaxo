package EstruturadeRepeticao;


import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPositivos {
	     
          public static void main(String[] args) {
        	Scanner leitor = new Scanner(System.in);
        	ArrayList<Double> numerosPositivos = new ArrayList<>();
			boolean positivo = true;
			
			while(positivo) {
				System.out.print("digite  um numero qualquer:");
				double numero =leitor.nextDouble();
				numerosPositivos.add(numero);
				if(numero<0) {
					positivo=false;
				}
				
			}
			for(double numero:numerosPositivos) {
				System.out.println(numero);
			}
		}
}
