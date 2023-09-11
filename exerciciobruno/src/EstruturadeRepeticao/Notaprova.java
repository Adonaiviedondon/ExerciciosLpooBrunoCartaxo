package EstruturadeRepeticao;

import java.util.Scanner;

public class Notaprova  {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        boolean boletim = true;

        while (boletim) {
            System.out.print("Digite a nota : ");
            double nota = valor.nextDouble();

            if (nota < 0.0 || nota > 10.0) {
                System.out.println("Nota inválida digite um valor valido");
           
            }
            else {
            	System.out.println(nota);
            	boletim=false;
            }
            
        
    }
}
}
