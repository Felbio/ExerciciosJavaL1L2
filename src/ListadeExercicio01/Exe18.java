package ListadeExercicio01;

import java.util.Scanner;

public class Exe18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o ângulo:");
		double an = scan.nextDouble();

		double rad = an * (Math.PI / 180);
		double sen = Math.sin(rad);
		double coseno = Math.cos(rad);
		double tang = Math.tan(rad);

		System.out.printf("Seno: %.2f\nCosseno: %.2f\nTangente: %.2f ", sen, coseno, tang);

		scan.close();
	}

}
