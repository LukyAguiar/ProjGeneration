package SubClasse;

import SuperClasse.Pessoa;

public class Fornecedor extends Pessoa
{
	//Atributos
	String cnpj;
	String ie;
	String contato; 
	
	public Fornecedor(String nome, int codigo, String cnpj){
		super(nome,codigo);
		this.cnpj = cnpj;
		
	}
	
	//
	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	//
	void inserirDadosFornecedor() {
		
	}
	
	void apresentarFornedor() { 
		
	}
	
	
}
