package ListadeExercicio01;

import java.util.Scanner;

public class Exe19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade total de presta��es:");
		int qp = scan.nextInt();
		System.out.println("Digite a quantidade de presta��es pagas:");
		int pp = scan.nextInt();
		System.out.println("Digite o valor das presta��es, em R$:");
		int vPrest = scan.nextInt();

		double vt = vPrest * qp;
		double vPag = pp * vPrest;
		double vDev = (qp - pp) * vPrest;

		System.out.println("Quantidade de presta��es: " + qp);
		System.out.println("Quantidade de presta��es pagas: " + pp);
		System.out.println("Valor das presta��es: " + vPrest);
		System.out.println("Valor do cons�rcio: " + vt);
		System.out.println("Valor pago: " + vPag);
		System.out.println("Valor a pagar: " + vDev);
		scan.close();
	}

}
