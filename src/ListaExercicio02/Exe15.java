package ListaExercicio02;

import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double invFinal = 0, rendiment = 0;
		System.out.println("Descreva o tipo do investimento:");
		System.out.println("1- Poupança\n2- Fundos de renda fixa");
		int opcao = scan.nextInt();

		System.out.println("Digite o valor do investimento:");
		double invest = scan.nextDouble();

		if (opcao == 1) {
			System.out.println("Poupança");
			rendiment = invest * 0.03;
			invFinal = invest + rendiment;
		} else if (opcao == 2) {
			System.out.println("Fundo de renda fixa");
			rendiment = invest * 0.04;
			invFinal = invest + rendiment;
		} else {
			System.out.println("Opção inválida!");
		}
		System.out.printf("\nInvestimento inicial: R$ %.2f", invest);
		System.out.printf("\nRendimento mensal: R$%.2f", rendiment);
		System.out.printf("\nInvestimento Final: R$ %.2f", invFinal);

		scan.close();
	}

}
