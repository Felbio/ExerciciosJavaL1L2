package ListadeExercicio01;

import java.util.Scanner;

public class Exe17 {
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

		media = (n1 * 2 + n2 * 4 + n3 * 6 + n4 * 8) / (2 + 4 + 6 + 8);
		System.out.printf("A média final do aluno é: %.2f", media);
		if (media >= 6) {
			System.out.println("\nAluno aprovado!");
		} else {
			System.out.println("\nAluno reprovado!");
		}
		scan.close();
	}
}
