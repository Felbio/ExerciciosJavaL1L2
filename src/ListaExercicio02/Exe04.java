package ListaExercicio02;

import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite A:");
		int a = scan.nextInt();
		System.out.println("Digite B:");
		int b = scan.nextInt();
		System.out.println("Digite C:");
		int c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println("A é maior!");
		} else if (b > a && b > c) {
			System.out.println("B é maior!");
		} else if (c > a && c > b) {
			System.out.println("C é maior!");
		} else {
			System.out.println("A, B, e C são iguais!");
		}
		scan.close();
	}
}
