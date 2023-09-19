package EstruturadeRepeticao;

import java.util.Scanner;

public class Gabarito {
      public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i;
		int Acertos=0;
		char[]perguntas = new char[10];
		char[]respostas = new char[10];

		for(i=0;i<10;i++) {
		System.out.printf("digite a resposta do aluno  da questao %d:",(i+1));
		char letra = leitor.next().toLowerCase().charAt(0);
	    switch(letra) {
	      case 'a':
	    	  perguntas[i]='a';
	    	  break;
	      case 'b':
	    	  perguntas[i]='b';
	    	  break;
	      case 'c':
	    	  perguntas[i]='c';
	    	  break;
	      case 'd':
	    	  perguntas[i]='d';
	    	  break;
	      case 'e':
	    	  perguntas[i]='e';
	    	  break;
	      default:
              respostas[i] = ' ';
              break;
	    	  
	 }
	    for(i=0;i<10;i++) {
	    	System.out.printf("digite a resposta da questao %d:",(i+1));
	    	char letra1 = leitor.next().toLowerCase().charAt(0);
	    	switch(letra1) {
	    	case 'a':
	    		respostas[i]='a';
	    		break;
	    	case 'b':
	    		respostas[i]='b';
	    		break;
	    	case 'c':
	    		respostas[i]='c';
	    		break;
	    	case 'd':
	    		respostas[i]='d';
	    		break;
	    	case 'e':
	    		respostas[i]='e';
	    		break;
	    	default:
	              respostas[i] = ' ';
	              break;
	    	}
	    	for(i=0;i<10;i++) {
	    		if(perguntas[i]==respostas[i]) {
	    			Acertos++;
	    		}
	    }
	    	System.out.println("Número de acertos: " + Acertos);

	        leitor.close();
  }
}
}
}
