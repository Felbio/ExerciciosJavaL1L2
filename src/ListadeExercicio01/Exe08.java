package ListadeExercicio01;

import java.util.Scanner;

public class Exe08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o n�mero de dias: ");
		int idade = scan.nextInt();
		
		int ano = idade / 365;
		int mes = (idade % 365) / 30;
		int dia = ((idade % 365) % 30);
		
		System.out.printf("Voce t�m %d anos, %d meses e %d dias.", ano, mes, dia);		
		scan.close();
	}

}
