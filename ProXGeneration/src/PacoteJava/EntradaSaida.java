package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,soma;
		System.out.print("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.print("Entre com o valor de B: ");
		b = ler.nextInt();
		soma = a+b; 
		System.out.print("R: "+soma);
	}
}
