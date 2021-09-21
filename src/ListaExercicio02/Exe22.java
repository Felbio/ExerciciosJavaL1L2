package ListaExercicio02;

import java.util.Scanner;

public class Exe22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double peso, grupo_de_risco =0;
		int idade;
		System.out.println("Grupos de risco por idade e peso.");
		System.out.println("Digite a idade da pessoa em anos:");
		idade = scan.nextInt();
		System.out.println("Digite o peso da pessoa em kg.:");
		peso = scan.nextDouble();

		if (idade < 20) {
			if (peso <= 60) {
				grupo_de_risco = 9;
			} else if (peso <= 90) {
				grupo_de_risco = 8;
			} else {
				grupo_de_risco = 7;
			}
		} else if (idade < 50) {
			if (peso <= 60) {
				grupo_de_risco = 6;
			} else if (peso <= 90) {
				grupo_de_risco = 5;
			} else {
				grupo_de_risco = 4;
			}
		} else {
			if (idade < 60) {
				if (peso <= 60) {
					grupo_de_risco = 3;
				} else if (peso <= 90) {
					grupo_de_risco = 2;
				} else {
					grupo_de_risco = 1;
				}
			}
		}
		System.out.printf("Pessoa pertence ao grupo de risco: %.2f.", grupo_de_risco);

		scan.close();
	}

}
