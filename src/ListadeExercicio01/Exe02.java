package ListadeExercicio01;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double L1, L2, hipotenusa;
		System.out.println("Digite dois números");
		double m = scan.nextDouble();
		double n = scan.nextDouble();
		L1 = Math.pow(m, 2) - Math.pow(n, 2);
		L2 = 2 * m * n;
		hipotenusa = Math.pow(m, 2) + Math.pow(n, 2);
		System.out.printf("\nL1 = %.2f", L1);
		System.out.printf("\nL2 = %.2f", L2);
		System.out.printf("\nHipotenusa = %.2f", hipotenusa);
		scan.close();
	}

}
