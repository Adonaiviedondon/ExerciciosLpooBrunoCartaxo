package EstruturadeDecisao;

import java.util.Scanner;

public class Emissora {
      public static void main(String[] args) {
		Scanner valor = new Scanner (System.in);
		System.out.print("digite o numero da emissora:");
		int emissora = valor.nextInt();
		switch(emissora) {
		case 2:
			System.out.println("emissora:SBT");
			break;
		case 4:
			System.out.println("emissora:BAND");
			break;
		case 6:
			System.out.println("emissora:RedeTv");
			break;
		case 9:
			System.out.println("emissora:Record");
			break;
		case 13:
			System.out.println("emissora:GLOBO");
			break;
		default:
			System.out.println("Canal Invalido");
		}
	}
}
