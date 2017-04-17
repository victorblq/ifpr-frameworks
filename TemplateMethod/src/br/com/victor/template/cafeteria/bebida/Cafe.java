package br.com.victor.template.cafeteria.bebida;

public class Cafe extends BebidaCafeinada
{
	@Override
	public void misturar()
	{
		System.out.println("Moendo café");
	}

	@Override
	public void addCondimento()
	{
		System.out.println("Adicionando leite ao café");
	}
}
