package ListadeExercicio01;

import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n, d1, d2, d3, nInv;

		System.out.println("Inversão de número de 3 digitos.");
		System.out.println("Digite número de 3 (CDU):");
		n = scan.nextInt();

		d1 = n / 100;
		d2 = (n % 100) / 10;
		d3 = (n % 100) % 10;
		nInv = d1 + 10 * d2 + 100 * d3;

		System.out.println("Nº original = " + n);
		System.out.println("Nº invertido = " + nInv);

		scan.close();
	}

}
