package ListadeExercicio01;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a11, a12, a21, a22;
		System.out.println("Calculo do Determinante de uma matriz de 2x2");
		System.out.println("Digite o valo da 1� linha, 1� coluna: ");
		a11 = scan.nextDouble();
		System.out.println("Digite o valo da 1� linha, 2� coluna: ");
		a12 = scan.nextDouble();
		System.out.println("Digite o valo da 2� linha, 1� coluna: ");
		a21 = scan.nextDouble();
		System.out.println("Digite o valo da 2� linha, 2� coluna: ");
		a22 = scan.nextDouble();

		double determinante = a11 * a22 - a12 * a21;
		System.out.printf("Determinante da martriz = %.1f", determinante);

		scan.close();

	}

}
