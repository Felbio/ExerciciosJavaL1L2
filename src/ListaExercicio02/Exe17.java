package ListaExercicio02;

import java.util.Scanner;

public class Exe17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Seja bem vindo!");
		System.out.println("Digite a tua senha de login:");
		int senha = scan.nextInt();

		if (senha == 4531) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Senha inválida!\nAcesso não permitido!");
		}

		scan.close();
	}
}
