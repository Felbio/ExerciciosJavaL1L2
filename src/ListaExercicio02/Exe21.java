package ListaExercicio02;

import java.util.Scanner;

public class Exe21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o preço do profuto:");
		double preco = scan.nextDouble();
		System.out.println("Código de origem do produto:");
		int cod = scan.nextInt();

		if (cod == 0 || cod > 30) {
			System.out.println("Este código não existe!\nPor favor, reinicie o programa!");
		} else {
			int codigo = cod;
			double pre = preco;
			String procedencia = null;
			if (codigo == 1) {
				procedencia = " Sul ";
			} else if (codigo == 2) {
				procedencia = " Norte ";
			} else if (codigo == 3) {
				procedencia = " Leste ";
			} else if (codigo == 4) {
				procedencia = " Oeste ";
			} else if (codigo >= 5 && codigo <= 6) {
				procedencia = " Nordeste ";
			} else if (codigo >= 7 && codigo <= 9) {
				procedencia = " Suldeste ";
			} else if (codigo >= 10 && codigo <= 20) {
				procedencia = " Centro-Oeste ";
			} else if (codigo >= 21 && codigo <= 30) {
				procedencia = " Nordeste ";
			}
			System.out.printf("\nProduto de R$ %.2f.", pre);
			System.out.printf("\nÉ de procedência da regiao %s.", procedencia);
		}

		scan.close();
	}

}
