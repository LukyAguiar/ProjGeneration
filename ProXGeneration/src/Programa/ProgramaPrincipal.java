package Programa;

import SubClasse.Cliente;
import SubClasse.Fornecedor;
import SubClasse.Funcionario;
import SuperClasse.Pessoa;



public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Pessoa lucas = new Pessoa("Lucas",777);
		Funcionario gabriel = new Funcionario("Gabriel",888,"Sequoia");
		Fornecedor playboy = new Fornecedor("Playboy",489,"Embu das Artes - CN78954");
		Cliente usuario = new Cliente("Rodrigo",666,"56.85.456.56","489.784.451.50");
		
		
		System.out.println(lucas.getNome()+"   | Código: "+lucas.getCodigo());
		System.out.println(gabriel.getNome()+ "| Código: "+gabriel.getCodigo()+"|Departamento:  "+gabriel.getDepartamento());
		System.out.println(playboy.getCnpj()+" | Nome: "+playboy.getNome()+"|Código: "+playboy.getCodigo());
		System.out.println(usuario.getNome()+" | Código: "+usuario.getCodigo()+"|CPF:  "+usuario.getCpf()+" "+usuario.getRg());
	}

}
