package ListaExercicio02;

import java.util.Scanner;

public class Exe11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double totAumento, porcAumento = 0;
		System.out.println("Digite o salário do funcionário:");
		double salario = scan.nextDouble();

		if (salario < 300) {
			porcAumento = 0.15;
			totAumento = salario + (salario * porcAumento);
		} else if (salario < 600) {
			porcAumento = 0.10;
			totAumento = salario + (salario * porcAumento);
		} else if (salario < 900) {
			porcAumento = 0.05;
			totAumento = salario + (salario * porcAumento);
		} else {
			totAumento = salario + (salario * porcAumento);
		}
		System.out.printf("Novo salário: R$ %.2f", totAumento);
		scan.close();
	}

}
