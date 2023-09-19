package EstruturadeRepeticao;

import java.util.Scanner;

public class PesquisaAcademia {
        public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			double alturamenor=0;
			double alturamaior=0;
			double pesomenor=0;
			double pesomaior=0;
			int contador=0;
			int totalaltura = 0;
			int totalpeso = 0;
			int codigoaltura= 0;
			int codigopeso=0;
		while(true) {
			System.out.print("digite o codigo do aluno:");
			int codigoAluno=leitor.nextInt();
			if(codigoAluno==0) {
				break;
			}
			System.out.print("digite o peso do aluno:");
			double pesoAluno=leitor.nextDouble();
			System.out.print("digite a altura do aluno:");
			double alturaAluno=leitor.nextDouble();
			
                			
				if(contador==0) {
					pesomenor = pesoAluno;
					alturamenor= alturaAluno;
					codigoaltura=codigoAluno;
					codigopeso=codigoAluno;
					contador++;
				}
				else  {
					if(pesoAluno<pesomenor){
				        pesomenor=pesoAluno;
				        codigopeso=codigoAluno;
					}
					if(alturaAluno<alturamenor) {
						alturamenor=alturaAluno;
						codigoaltura=codigoAluno;
					}
					
					
				}

	}
		try {
			System.out.println("a media de pesos eh %f"+(totalpeso/contador));
			System.out.println("a media de alturas eh %f"+(totalaltura/contador));
			System.out.println("o codigo peso %f "+(codigopeso));
			System.out.println("o menor peso eh %f"+(pesomenor));
			System.out.println("o codigo altura eh %f"+(codigoaltura));
			System.out.println("a menor altura eh %f"+(alturamenor));
		}catch(ArithmeticException e) {
			System.out.println("nao eh possivel dividir por 0");
}
        }
        }

