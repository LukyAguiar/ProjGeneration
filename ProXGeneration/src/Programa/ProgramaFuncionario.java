package Programa;

import Visibilidade.Funcionario;

public class ProgramaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Lucas");
		f1.setSalario(4000.00);
		
		
		System.out.printf("Nome: " + f1.getNome() + " Salario: " + f1.getSalario());
	}

}
