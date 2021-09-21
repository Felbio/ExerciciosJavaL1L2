package ListadeExercicio01;

import java.util.Scanner;

public class Exe16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, aux;
		System.out.println("Troca de valores de vari·veis inteiras");
		System.out.println("Digite A: ");
		a = scan.nextInt();
		System.out.println("Digite B: ");
		b = scan.nextInt();
		System.out.println("Voc  digitou: " + a + " e " + b);
		
		aux = a;
		a = b;
		b = aux;

		System.out.println("Vari·veis invertidas: " + a + " e " + b);
		scan.close();
	}

}
