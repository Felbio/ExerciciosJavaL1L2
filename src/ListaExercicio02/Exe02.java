package ListaExercicio02;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = scan.nextDouble();

		double media = (n1 + n2) / 2;

		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		}
		else if (media >= 4) {
			System.out.println("Aluno em exame!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		scan.close();
	}

}
