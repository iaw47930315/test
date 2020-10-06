package com.daw.pol;
import java.util.Scanner;

public class Operacio {

	public static void main(String[] args) {
		int resultat;
		String resposta = "No has introduit una de les opcions d'operadors";
		Scanner s = new Scanner(System.in);
		System.out.println("Escriu el primer nombre nombre:");
		int num1 = s.nextInt();
		System.out.println("Escriu el segon nombre nombre:");
		int num2 = s.nextInt();
		System.out.println("Escriu el tipus d'operacio que vols realitzar (+, -, *, /):");
		char op = s.next().charAt(0);
		if (op == '+') {
			resultat = num1 + num2;
			resposta = num1 + " " + op + " " + num2 + " = " + resultat;
		} else if (op == '-') {
			resultat = num1 - num2;
			resposta = num1 + " " + op + " " + num2 + " = " + resultat;
		} else if (op == '*') {
			resultat = num1 * num2;
			resposta = num1 + " " + op + " " + num2 + " = " + resultat;
		} else if (op == '/') {
			resultat = num1 / num2;
			resposta = num1 + " " + op + " " + num2 + " = " + resultat;
		}
		System.out.println(resposta);
		s.close();
	}

}
