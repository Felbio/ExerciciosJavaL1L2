package ListadeExercicio01;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, delta;
		System.out.println("Digite o valor de a:");
		a = scan.nextDouble();
		System.out.println("Digite o valor de b:");
		b = scan.nextDouble();
		System.out.println("Digite o valor de c:");
		c = scan.nextDouble();
		delta = Math.pow(b, 2.00) - 4.00 * a * c;
		if (delta < 0.00) {
			System.out.println("Delta inexistente!");
		}else {
			System.out.printf("O valor de delta é: %.2f", delta);
		}	
		scan.close();
	}
}
