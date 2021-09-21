package ListaExercicio02;

import java.util.Scanner;

public class Exe20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cat = null;
		System.out.println("Digite a tua idade!");
		int idade = scan.nextInt();

		if (idade >= 5 && idade <= 100) {

			if (idade >= 5 && idade <= 7) {
				cat = " Infantil";
			} else if (idade >= 8 && idade <= 10) {
				cat = " Juvenil";
			} else if (idade >= 11 && idade <= 15) {
				cat = " Adolescente";
			} else if (idade >= 16 && idade <= 30) {
				cat = " Adulto";
			} else {
				cat = " Sênior";
			}
			System.out.printf("Você tem %d anos e é nadador %s.", idade, cat);
		} else {
			System.out.println("Idade inválida!");
		}

		scan.close();
	}

}
