package ListaExercicio02;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, n4, media;

		System.out.println("Digite a 1� nota:");
		n1 = scan.nextDouble();
		System.out.println("Digite a 2� nota:");
		n2 = scan.nextDouble();
		System.out.println("Digite a 3� nota:");
		n3 = scan.nextDouble();
		System.out.println("Digite a 4� nota:");
		n4 = scan.nextDouble();
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("M�dia: %.2f", media);
		if (media >= 7) {
			System.out.println("\nAluno aprovado!");
		} else {
			System.out.println("\nAluno reprovado!");
		}
		scan.close();

	}

}
