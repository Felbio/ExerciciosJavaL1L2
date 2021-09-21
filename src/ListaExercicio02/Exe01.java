package ListaExercicio02;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, n4, media;

		System.out.println("Digite a 1ª nota:");
		n1 = scan.nextDouble();
		System.out.println("Digite a 2ª nota:");
		n2 = scan.nextDouble();
		System.out.println("Digite a 3ª nota:");
		n3 = scan.nextDouble();
		System.out.println("Digite a 4ª nota:");
		n4 = scan.nextDouble();
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("Média: %.2f", media);
		if (media >= 7) {
			System.out.println("\nAluno aprovado!");
		} else {
			System.out.println("\nAluno reprovado!");
		}
		scan.close();

	}

}
