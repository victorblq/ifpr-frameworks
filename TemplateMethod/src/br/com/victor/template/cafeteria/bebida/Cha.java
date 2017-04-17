package br.com.victor.template.cafeteria.bebida;

public class Cha extends BebidaCafeinada
{
	@Override
	public void misturar()
	{
		System.out.println("Molhando o saquinho");
	}

	@Override
	public void addCondimento()
	{
		System.out.println("Adicionando limão ao chá");
	}
}
