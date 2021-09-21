package ListaExercicio02;

import java.util.Scanner;

public class Exe14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salFinal, aumento;
		System.out.println("Digite o valor do salário do funcionário:");
		double salario = scan.nextDouble();

		if (salario < 300) {
			aumento = salario * 0.50;
			salFinal = salario + aumento;
		} else if (salario < 500) {
			aumento = salario * 0.40;
			salFinal = salario + aumento;
		} else if (salario < 700) {
			aumento = salario * 0.30;
			salFinal = salario + aumento;
		} else if (salario < 800) {
			aumento = salario * 0.20;
			salFinal = salario + aumento;
		} else if (salario < 1000) {
			aumento = salario * 0.10;
			salFinal = salario + aumento;
		} else {
			aumento = salario * 0.05;
			salFinal = salario + aumento;
		}
		System.out.printf("Valor do aumento: R$ %.2f", aumento);
		System.out.printf("Novo salário: R$ %.2f", salFinal);
		scan.close();
	}

}
