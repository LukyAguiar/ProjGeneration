package SuperClasse;

public class Pessoa 
{
	
	//Atributos
	int codigo; 
	String nome;
	String endereco;
	String bairro;
	String cidade; 
	String uf; 
	String telefone; 
	String celular;
	
	//Constrututor
	public Pessoa (String nome,int codigo) 
	{
		this.nome = nome; 
		this.codigo = codigo;
		
	}
	
	
	//Getter - Setters
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	void mostrarTelefone()
	{ 
		
	}
	
}
