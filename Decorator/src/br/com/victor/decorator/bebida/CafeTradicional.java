package br.com.victor.decorator.bebida;

//Componente concreto
public class CafeTradicional extends Bebida
{
	public CafeTradicional()
	{
		super.setDescricao("Café Tradicional");
	}
	
	@Override
	public double calcularPreco()
	{
		return 2.00;
	}

}
