package ListaExercicio02;

import java.util.Scanner;

public class Exe16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double desconto = 0, precoFinal;
		String descont = null;
		System.out.println("Digite o preço atual do produto: ");
		double precoAtual = scan.nextDouble();

		if (precoAtual < 30) {
			precoFinal = precoAtual - desconto;
			descont = "Sem desconto.";
		} else if (precoAtual < 100) {
			desconto = precoAtual * 0.10;
			precoFinal = precoAtual - desconto;
			descont = "Desconto de 10 %.";
		} else {
			desconto = precoAtual * 0.15;
			precoFinal = precoAtual - desconto;
			descont = "Desconto de 15 %.";
		}

		System.out.printf("\nPreço atual: R$%.2f", precoAtual);
		System.out.printf("\n%s", descont);
		System.out.printf("\nDesconto: R$ %.2f", desconto);
		System.out.printf("\nPreço final: R$ %.2f", precoFinal);

		scan.close();
	}

}
