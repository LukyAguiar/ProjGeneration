package POO;

public class MetodoSobrecarregado {

	//M�todos - Ac�es 
	
	public void TestaMetodosSobrecarregados()
	{
		System.out.printf("Sal�rio em n�mero inteiro: %d \n",salario(4000));
		System.out.printf("Sal�rio em n�mero inteiro: %f \n",salario(4500.70));
	}
	
	public int salario(int valorInt)
	{
		System.out.printf("Sal�rio com inteiro: %d \n",valorInt);
		return valorInt * valorInt;
	}
	
	public double salario(double valorDouble)
	{
		System.out.printf("Sal�rio com double: %f \n",valorDouble);
		return valorDouble * valorDouble;
	}
}
