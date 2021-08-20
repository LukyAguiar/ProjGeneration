package Polimorfismo;

public class ProgramaPolimorfismo {

	public static void main(String[] args) 
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Lucarino");
		fisica.setCpf(87454864574L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Marquinos Churras");
		juridica.setCnpj(15104515151544L);
		
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
		
		//Polimorfismo � o uso de um mesmo nome para identificar diferentes implementa��es dos m�todos
		
	}

}
