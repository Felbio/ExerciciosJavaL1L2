package ListaExercicio02;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite A:");
		int a = scan.nextInt();
		System.out.println("Digite B:");
		int b = scan.nextInt();

		if (a < b) {
			System.out.println("A � menor que B!");
		} else if (b < a) {
			System.out.println("B � menor que A!");
		} else {
			System.out.println("ambos s�o iguais!");
		}
		scan.close();
	}
}
