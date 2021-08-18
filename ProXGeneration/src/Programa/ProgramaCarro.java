package Programa;

import java.util.Scanner;

import POO.Carro;

public class ProgramaCarro {

	public static void main(String[] args) 
	{
	
		Carro meuCarro = new Carro("Preto","Audi A4",0,80);
		
		meuCarro.liga();
		
		meuCarro.acelera(41);
		System.out.println(meuCarro.velocidadeAtual);
		
	}
}
