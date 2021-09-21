package ListadeExercicio01;

import java.util.Scanner;

public class Exe11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor da compra do dolar:");
		double dolar = scan.nextDouble();
		System.out.println("Digite o valor da cotação do dolar:");
		double cotDolar = scan.nextDouble();
		System.out.println("Digite o valor d ICMS::");
		double icms = scan.nextDouble();
		
		double valoPagar = (dolar * cotDolar) + (dolar * cotDolar * (icms / 100));
		
		System.out.printf("O valor a pagar será R$ %.2f", valoPagar);
		scan.close();
	}
}
