package EstruturadeRepeticao;

import java.util.Scanner;

public class PesquisaAcademia {
           public static void main(String[] args) {
			Scanner pessoa = new Scanner(System.in);
			System.out.print("digite o numero de pessoas na academia");
			int n =pessoa.nextInt();
			ArrayList<Double> pessoasAltura = new ArrayList<>();
	        ArrayList<Double> pessoasPeso = new ArrayList<>();
			
			for(int i=0;i<n;n++) {
				System.out.printf("digite a altura do aluno %d",(i+1));
				double altura = pessoa.nextDouble();
				
				
			}
			
		}
}
