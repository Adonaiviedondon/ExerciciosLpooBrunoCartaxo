package EstruturadeRepeticao;

import java.util.Scanner;

public class BaseExpoente {
    public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		int i;
		double resultado=1;
		System.out.print("digite a base:");
		int base=leitor.nextInt();
		System.out.print("digite o expoente: ");
		int expoente=leitor.nextInt();
		if(expoente==0) {
			resultado =1;
		   }
		else if(expoente>0) {
		    for(i=1;i<=expoente;i++) {
			    resultado*=base;
		   }
		}
     else if (expoente < 0) {
        int expoentePositivo = -expoente; 
        for (int i1 = 1; i1 <= expoentePositivo; i1++) {
            resultado *= base;
        }
         resultado=1/resultado;
    }
    
    System.out.println(resultado);
    }
}
		
	

