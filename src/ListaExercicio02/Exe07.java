package ListaExercicio02;

import java.util.Scanner;

public class Exe07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double aumento, salario;
		System.out.println("Digite o salário do funcionário:");
		salario = scan.nextDouble();
		if (salario <= 500) {
			aumento = salario + (salario * 0.30);
			System.out.printf("O novo salário será: %.2f", aumento);
		} else {
			System.out.println("Esse funcionário não tem direiro a aumento!");
		}
		scan.close();
	}

}
