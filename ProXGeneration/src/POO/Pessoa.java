package POO;

public class Pessoa {

	//Atributos
	//Private - Para deixar o Atributo Seguro;
	private String nome; 
	private String sobrenome;
	private String ultimoNome;
	
	//Construtor 
	public Pessoa (String primeiro ,String meio,String ultimo) {
		nome = primeiro;
		sobrenome = meio;
		ultimoNome = ultimo;
	}
	
	
	//Método que retorna o nome completo;
	public String getNomeCompleto()
	{
		String nomeCompleto = nome + "" + sobrenome + "" + ultimoNome;
		return nomeCompleto;
	}
}
