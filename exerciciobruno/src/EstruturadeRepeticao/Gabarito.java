package EstruturadeRepeticao;

import java.util.Scanner;

public class Gabarito {
      public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i;
		int Acertos=0;
		char[]perguntas = new char[10];
		char[]respostas = new char[10];
		int perguntascontador = 0;

		for(i=0;i<10;i++) {
		 System.out.printf("digite a resposta do aluno  da questao %d:",(i+1));
		 char letra = leitor.next().toLowerCase().charAt(0);
		 if(letra=='a'||letra=='b'||letra=='c'||letra=='d'||letra=='e') {
			 
			 perguntas[i]=letra;
			 perguntascontador++;
			 
		 }
		 else {
			 break;
		 }
		 
		}
	    for(i=0;i<10;i++) {
	    	if(perguntascontador!=10) {
	    		break;
	    	}
	    	System.out.printf("digite o gabarito da questao %d:",(i+1));
	    	char letra = leitor.next().toLowerCase().charAt(0);
	    	if(letra=='a'||letra=='b'||letra=='c'||letra=='d'||letra=='e') {
	    		respostas[i]=letra;
			 }
			 else {
				break; 
			 }
	    }
	    for(i=0;i<10;i++) {
	    	if(perguntascontador!=10) {
	    		break;
	    	}
	    		if(perguntas[i]==respostas[i]) {
	    			Acertos++;
	    		}
	    }
	    	System.out.println("Número de acertos: " + Acertos);

	        leitor.close();
  }
}


