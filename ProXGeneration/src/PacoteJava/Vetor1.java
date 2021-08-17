package PacoteJava;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,48};
		
		float[] nota = new float[5];
		
		//Array é Array né pai
		if (arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		} else {
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
			System.out.println("\n Tamanho do ArrayUm =" + arrayUm.length);

			
			
			// Praticando ATÉ O LIMITE For-each 
			String[] frutas = {"Maça","Pêra","Morango","Uva"};
			for (String i : frutas) 
			{
				System.out.println(i);
			}
			
			
			
			
			//Jogando tudo no Array 
			
			for (int i=0; i<5;i++) 
			{
				System.out.println("Entre com uma nota: ");
				nota[i]=entrada.nextFloat();
			}
			
			//Apresentando um array 
			for(int i=0;i<5;i++) 
			{
				System.out.println("Nota: "+ i + 1 +" = "+nota[i]);
			}
			
			
	}

}
