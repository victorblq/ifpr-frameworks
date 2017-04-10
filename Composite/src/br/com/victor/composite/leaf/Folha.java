package br.com.victor.composite.leaf;

import br.com.victor.composite.component.Arvore;

//Leaf
public class Folha implements Arvore
{

	@Override
	public void add(Arvore arvore)
	{
		System.out.println("Não é possivel adiciona outra folha!");
	}

	@Override
	public void remove(Arvore arvore)
	{
		System.out.println("Não é possivel remover a folha!");
	}

	@Override
	public void print()
	{
		System.out.println("Oi! Eu sou uma folha!");
	}
	
}
