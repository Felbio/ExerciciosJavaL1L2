package ListaExercicio02;

import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double precoFinal, porc;
		String classific;
		System.out.println("Digite o valor do preço do produto:");
		double preco = scan.nextDouble();
		if (preco < 50) {
			porc = 0.05;
			precoFinal = preco + (preco * porc);
		} else if (preco < 100) {
			porc = 0.10;
			precoFinal = preco + (preco * porc);
		} else {
			porc = 0.15;
			precoFinal = preco + (preco * porc);
		}

		if (precoFinal < 80) {
			classific = " Barato ";
		} else if (precoFinal < 120) {
			classific = " Normal ";
		} else if (precoFinal < 200) {
			classific = " Caro ";
		} else {
			classific = " Muito Caro ";
		}
		System.out.printf("Preço final: R$ %.2f", precoFinal);
		System.out.printf("Classificação: Preço %s", classific);

		scan.close();
	}

}
