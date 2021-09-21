package ListaExercicio02;

import java.util.Scanner;

public class Exe19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double result = 0;
		int sex;
		System.out.println("Digite a sua altura");
		double alt = scan.nextDouble();
		System.out.println("Digite o teu sexo: \n '1' masculino e '2' feminino");
		sex = scan.nextInt();

		if (sex == 1) {
			result = (72.7 * alt) - 58;
			System.out.printf("Teu peso ideal é %.2f", result);
		}
		if (sex == 2) {
			result = (62.1 * alt) - 44.7;
			System.out.printf("Teu peso ideal é %.2f", result);
		}

		scan.close();
	}

}
