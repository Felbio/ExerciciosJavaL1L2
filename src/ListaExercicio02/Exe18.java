package ListaExercicio02;

import java.util.Scanner;

public class Exe18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a tua idade:");
		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Voc� � maior de idade!");
		} else {
			System.out.println("Voc� n�o atingiu a maioridade!");
		}

		scan.close();
	}

}
