package exemplos;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in);) {
			System.out.println("try");
			s.nextLine();
		} catch (Exception e) {
			System.out.println("catch");
			// s.nextLine(); N�O COMPILA pois o scopo � finalizado dentro do bloco try
			e.printStackTrace();
		} finally {
			System.out.println("finally");
			// s.nextLine(); N�O COMPILA pois o scopo � finalizado dentro do bloco try
		}

	}

}