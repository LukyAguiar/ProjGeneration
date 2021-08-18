package POO;

public class Carro {
	
	private String cor;
	private String modelo;
	public double velocidadeAtual;
	private double velocidadeMaxima;
	
	
	//Construtores
	public Carro(String getCor, String getModelo,double getVeloAtual, double getVeloMax)
	{
		getCor = this.cor;
		getModelo = this.modelo;
		getVeloAtual = this.velocidadeAtual;
		getVeloMax = this.velocidadeMaxima;
	}

	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	// Métodos
	public void liga()
	{
		System.out.println("O carro está ligado...");
	}
	
	public void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	public int pegaMarcha() 
	{
		if(this.velocidadeAtual < 0)
		{
			System.out.println("O cara está parado ");
			return -1;
		}
		 
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual<40)
		{
			System.out.println("O carro está entrando em movimento");
			return 1;
		}
		
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual<80)
		{
			System.out.println("O carro ta está em um velocidade boa");
			return 2;
		}
		System.out.println("Tem parada errada ai irmão");
		return 3;
		
	}
}
