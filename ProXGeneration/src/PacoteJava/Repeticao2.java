package PacoteJava;

import java.util.Scanner;

public class Repeticao2 {
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.print("Entre com sua Idade: ");
		idade = entrada.nextInt();
		
		
		while(idade>=1)//Enquanto a condição for verdadeira - Executa o laço
		{
			System.out.printf("Sua Idade é %d ",idade);
			if(idade>=18) 
			{
				System.out.println("\nVocê é de maior...");
			}
			else
			{
				System.out.println("\n Você é de menor...");
			}
			System.out.println("\n Entre com suia idade: ");
			idade = entrada.nextInt();
		}
	}

}
