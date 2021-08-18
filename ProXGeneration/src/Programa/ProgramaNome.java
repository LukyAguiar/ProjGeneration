package Programa;

import POO.Pessoa;

public class ProgramaNome {

	public static void main(String[] args) {
		
		//Estânciando //Atributos: nome  | sobrenome | ultimoNome 
		Pessoa p1 = new Pessoa("Lucas ","Silva ","Nunes de Aguiar");
		Pessoa p2 = new Pessoa("Marcos ","Vinicius ","De Jesus");
		Pessoa p3 = new Pessoa("Vitória ","Silva ","Nunes de Aguiar");
		Pessoa p4 = new Pessoa("José ","Nunes ","de Aguiar");
		
		
		
		System.out.println("Eu: "+p1.getNomeCompleto()+" | Sobrinho:  "+p2.getNomeCompleto());
		System.out.println("Mãe: "+p3.getNomeCompleto()+"| Pai: "+p4.getNomeCompleto());
		
	}
}
