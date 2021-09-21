package ListaExercicio02;

import java.util.Scanner;

public class Exe08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double reajuste, salario;
		System.out.println("Digite o salário do funcionário:");
		salario = scan.nextDouble();
		if (salario <= 300) {
			reajuste = salario + (salario * 0.35);
			System.out.printf("O novo salário será: %.2f", reajuste);
		} else {
			reajuste = salario + (salario * 0.15);
			System.out.printf("O novo salário será: %.2f", reajuste);
		}
		scan.close();
	}

}
