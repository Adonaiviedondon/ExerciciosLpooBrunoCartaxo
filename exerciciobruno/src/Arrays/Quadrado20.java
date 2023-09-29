package Arrays;

import java.util.Scanner;

public class Quadrado20 {
   public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int[]array=new int[20];
	for (int i = 0; i < array.length; i++) {
		array[i]=(int)Math.pow(i, 2);
	}
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
	}
}
}
