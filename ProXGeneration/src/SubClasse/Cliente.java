package SubClasse;

import SuperClasse.Pessoa;

public class Cliente extends Pessoa
{
	//Atributos 
		double limiteCredito; 
		double rendaMensal; 
		String rg;
		String cpf;
		
	//Construtor
	public Cliente(String nome, int codigo, String rg, String cpf) {
		super(nome, codigo);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	//Getter - Setter 
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	//Método
	void inserirDadosCliente() {
		
	}
	
	

	void apresentarCliente() {
		
	}
	
	
}
