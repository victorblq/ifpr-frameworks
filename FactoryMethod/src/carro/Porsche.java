package carro;

import factory.ICarro;

public class Porsche implements ICarro
{

	@Override
	public void exibirDetalhes()
	{
		System.out.println("Criando um Porsche 2017!");
	}
	
}
