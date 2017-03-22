package carro;

import factory.ICarro;

public class Palio implements ICarro
{

	
	@Override
	public void exibirDetalhes()
	{
		System.out.println("Criando um Palio 2008!");
	}

}
