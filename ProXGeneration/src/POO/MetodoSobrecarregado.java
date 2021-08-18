package POO;

public class MetodoSobrecarregado {

	//Métodos - Acões 
	
	public void TestaMetodosSobrecarregados()
	{
		System.out.printf("Salário em número inteiro: %d \n",salario(4000));
		System.out.printf("Salário em número inteiro: %f \n",salario(4500.70));
	}
	
	public int salario(int valorInt)
	{
		System.out.printf("Salário com inteiro: %d \n",valorInt);
		return valorInt * valorInt;
	}
	
	public double salario(double valorDouble)
	{
		System.out.printf("Salário com double: %f \n",valorDouble);
		return valorDouble * valorDouble;
	}
}
