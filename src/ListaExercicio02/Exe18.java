package ListaExercicio02;

import java.util.Scanner;

public class Exe18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a tua idade:");
		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você não atingiu a maioridade!");
		}

		scan.close();
	}

}
