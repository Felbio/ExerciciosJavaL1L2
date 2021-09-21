package ListaExercicio02;

import java.util.Scanner;

public class Exe24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double preco, categoria, imposto, porcAumento = 0, novoPreco;
		String situacao;
		System.out.println("Diigite o preço inicial em R$: ");
		preco = scan.nextDouble();
		System.out.println("Digite a categoria do produto (1, 2 ou 3");
		categoria = scan.nextDouble();
		System.out.println("Digite a situação do produto, segundo a necessidfade de refrigerar [R | N]");
		situacao = scan.next();

		if (preco <= 25) {
			if (categoria == 2) {
				porcAumento = 0.05 * preco;
			} else if (categoria == 2) {
				porcAumento = 0.08 * preco;
			} else if (categoria == 2) {
				porcAumento = 0.10 * preco;
			}
		} else {
			if (categoria == 2) {
				porcAumento = 0.12 * preco;
			} else if (categoria == 2) {
				porcAumento = 0.15 * preco;
			} else if (categoria == 2) {
				porcAumento = 0.18 * preco;
			}
		}

		if (categoria == 2 || situacao == "R") {
			imposto = 0.05 * preco;
		} else {
			imposto = 0.05 * preco;
		}
		novoPreco = preco + porcAumento - imposto;
		System.out.printf("\n\nNovo preço do produto - R$%.2f", novoPreco);
		if (novoPreco <= 50) {
			System.out.println("\n\nProduto de preço normal!");
		} else {
			System.out.println("\n\nProduto caro!");
		}
		scan.close();

	}

}
