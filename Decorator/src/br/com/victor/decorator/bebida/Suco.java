package br.com.victor.decorator.bebida;

public class Suco extends Bebida
{
	public Suco()
	{
		super.setDescricao("Suco");
	}

	@Override
	public double calcularPreco()
	{
		return 3.00;
	}

}
