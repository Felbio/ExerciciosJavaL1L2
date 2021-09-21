package ListadeExercicio01;

import java.util.Scanner;

public class Exe19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade total de prestações:");
		int qp = scan.nextInt();
		System.out.println("Digite a quantidade de prestações pagas:");
		int pp = scan.nextInt();
		System.out.println("Digite o valor das prestações, em R$:");
		int vPrest = scan.nextInt();

		double vt = vPrest * qp;
		double vPag = pp * vPrest;
		double vDev = (qp - pp) * vPrest;

		System.out.println("Quantidade de prestações: " + qp);
		System.out.println("Quantidade de prestações pagas: " + pp);
		System.out.println("Valor das prestações: " + vPrest);
		System.out.println("Valor do consórcio: " + vt);
		System.out.println("Valor pago: " + vPag);
		System.out.println("Valor a pagar: " + vDev);
		scan.close();
	}

}
