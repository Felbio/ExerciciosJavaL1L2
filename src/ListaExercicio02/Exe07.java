package ListaExercicio02;

import java.util.Scanner;

public class Exe07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double aumento, salario;
		System.out.println("Digite o sal�rio do funcion�rio:");
		salario = scan.nextDouble();
		if (salario <= 500) {
			aumento = salario + (salario * 0.30);
			System.out.printf("O novo sal�rio ser�: %.2f", aumento);
		} else {
			System.out.println("Esse funcion�rio n�o tem direiro a aumento!");
		}
		scan.close();
	}

}
