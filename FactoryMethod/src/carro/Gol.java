package carro;

import factory.ICarro;

public class Gol implements ICarro
{

	@Override
	public void exibirDetalhes()
	{
		System.out.println("Criando um Gol 2004!");
	}
	
}
