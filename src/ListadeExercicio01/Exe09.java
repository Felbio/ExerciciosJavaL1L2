package ListadeExercicio01;

import java.util.Scanner;

public class Exe09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor inteiro a ser sacado: ");
		int saque = scan.nextInt();
		
		int cem = saque / 100;
        int cinq = (saque % 100) / 50;
        int dez = ((saque % 100) % 50) / 10;
        int cinc = (((saque % 100) % 50) % 10)/5;
        int hum = ((((saque % 100) % 50) % 10) % 5) /1;
		
		System.out.println("O banco despenderá: \n"
				+ cem + " notas de R$100,00,\n"
	            + cinq + " notas de R$50,00,\n" 
	            + dez + " notas de R$10,00,\n"
	            + cinc + " notas de R$5,00 e\n"
	            + hum + " notas de R$1,00.");			
		scan.close();
	}

}
