package SubClasse;

import SuperClasse.Pessoa;

public class Funcionario extends Pessoa
{
	double salarioBase;
	double salarioFinal; 
	private String departamento;
	
	public Funcionario(String nome, int codigo, String departamento) {
		super(nome, codigo);
		this.departamento = departamento;
	}
	
	//
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	//

	void inserirDadosFuncionario() {
		
	}
	
	void apresentarFuncionario() {
		
	}
}
