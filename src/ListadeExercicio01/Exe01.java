package ListadeExercicio01;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a tua idade:");
		double anos = scan.nextDouble();
		double bat = anos * 365.25 * 24 * 60 * 60;
		System.out.printf("O coração em %.2f anos, terá batido %.2f vezes.",anos , bat);
		scan.close();
	}

}
