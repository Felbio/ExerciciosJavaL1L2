package ListadeExercicio01;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a11, a12, a21, a22;
		System.out.println("Calculo do Determinante de uma matriz de 2x2");
		System.out.println("Digite o valo da 1ª linha, 1ª coluna: ");
		a11 = scan.nextDouble();
		System.out.println("Digite o valo da 1ª linha, 2ª coluna: ");
		a12 = scan.nextDouble();
		System.out.println("Digite o valo da 2ª linha, 1ª coluna: ");
		a21 = scan.nextDouble();
		System.out.println("Digite o valo da 2ª linha, 2ª coluna: ");
		a22 = scan.nextDouble();

		double determinante = a11 * a22 - a12 * a21;
		System.out.printf("Determinante da martriz = %.1f", determinante);

		scan.close();

	}

}
