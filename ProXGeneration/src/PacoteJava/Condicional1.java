package PacoteJava;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome; 
		
		System.out.print("Entre com a sua idade: ");
		idade = ler.nextInt(); // Recebe n�mero e coloca na v�riavel Idade
		ler.nextLine();//Limpando o Buffer de memoria - String
		System.out.print("Entre com o seu nome: ");
		nome = ler.nextLine(); // Recebe uma palavra e coloca na v�riavel nome; 
		
		System.out.printf("Seu nome: %s\n",nome);
		System.out.printf("Sua idade: %d\n",idade);
		
		if(idade >= 18){
			System.out.printf("%s Voc� � maior de Idade :) ",nome);
		}
		else if (idade>=1 && idade<18){
			System.out.printf("%s Voc� � menor de Idade :( ",nome);
		}
		else 
		{
			System.out.println("\nVoc� entrou com uma idade estranha rapaz");
		}

	}

}
//%s - String
//%d - Inteiro