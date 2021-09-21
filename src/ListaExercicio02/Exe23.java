package ListaExercicio02;

import java.util.Scanner;

public class Exe23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int codigo, quantidade;
		double preco, totalNota, desconto, precoFinal;
		System.out.println("Compra de Produtos");
		System.out.println("Digite o codigo do produto comprado [entre 1 e 40]:");
		codigo = scan.nextInt();
		System.out.println("Digite a quantidade de produtos comprados:");
		quantidade = scan.nextInt();
		// 1ª tabela
		if (codigo >= 1 && codigo <= 10) {
			preco = 10;
		} else if (codigo >= 11 && codigo <= 20) {
			preco = 15;
		} else if (codigo >= 21 && codigo <= 30) {
			preco = 20;
		} else {
			preco = 30;
		}
		totalNota = quantidade * preco;
		// 2ª tabela
		if (totalNota <= 250) {
			desconto = 0.05 * totalNota;
		} else if (totalNota <= 500) {
			desconto = 0.10 * totalNota;
		} else {
			desconto = 0.15 * totalNota;
		}

		precoFinal = totalNota - desconto;
		System.out.printf("\nPreço unitário do produto: R$ %.2f", preco);
		System.out.printf("\nPreço total da nota: R$ %.2f", totalNota);
		System.out.printf("\nValor do desconto: R$ %.2f", desconto);
		System.out.printf("\nPreço final da nota: R$ %.2f", precoFinal);
		scan.close();
	}

}
