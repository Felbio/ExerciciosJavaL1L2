package ListaExercicio02;

import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double dif = 0;
		System.out.println("Digite o primeiro n�mero:");
		double n1 = scan.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		double n2 = scan.nextDouble();

		System.out.println("Escolha uma op��o:\n1- M�dia\n2-Diferen�a de maior e menor\n3- Produto");
		int escolha = scan.nextInt();

		if (escolha == 1) {
			double media = (n1 + n2) / 2;
			System.out.printf("A media � %.2f", media);
		} else if (escolha == 2) {
			if (n1 > n2) {
				dif = n1 - n2;
				System.out.println("O primeiro n�mero � maior!");
				System.out.printf("A diferen�a � %.2f", dif);
			} else if (n2 > n1) {
				dif = n2 - n1;
				System.out.println("O segundo n�mero � maior!");
				System.out.printf("A diferen�a � %.2f", dif);
			} else {
				System.out.println("Ambos s�o iguais");
				System.out.printf("A diferen�a � %.2f", dif);
			}
		} else if (escolha == 3) {
			double produto = n1 * n2;
			System.out.printf("O produto � %.2f", produto);
		} else {
			System.out.println("Op��o inv�lida!");
		}

		scan.close();
	}
}
