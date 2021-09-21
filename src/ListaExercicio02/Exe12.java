package ListaExercicio02;

import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grat = 0, imposto = 0.07, salFinal;
		System.out.println("Digite o salário do funcionário:");
		double salario = scan.nextDouble();

		if (salario < 350) {
			grat = 100.00;
			salFinal = salario - (salario * imposto) + grat;
		} else if (salario < 600) {
			grat = 75.00;
			salFinal = salario - (salario * imposto) + grat;
		} else if (salario < 900) {
			grat = 50.00;
			salFinal = salario - (salario * imposto) + grat;
		} else {
			grat = 35.00;
			salFinal = salario - (salario * imposto) + grat;
		}
		System.out.printf("Salário final: R$ %.2f", salFinal);

		scan.close();
	}

}
