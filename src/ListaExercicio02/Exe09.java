package ListaExercicio02;

import java.util.Scanner;

public class Exe09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double saldo_medio = 0, valor_do_credito;

		System.out.println("Digite o saldo médio do cliente:");
		saldo_medio = scan.nextDouble();
		if (saldo_medio > 400) {
			valor_do_credito = saldo_medio * 0.30;
		} else if (saldo_medio > 300) {
			valor_do_credito = saldo_medio * 0.25;
		} else if (saldo_medio > 200) {
			valor_do_credito = saldo_medio * 0.20;
		} else {
			valor_do_credito = saldo_medio * 0.10;
		}
		System.out.printf("Crédito liberado = R$ %.2f", valor_do_credito);

		scan.close();
	}

}
