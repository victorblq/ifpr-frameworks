package br.com.victor.composite.composite;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.composite.component.Arvore;

public class Tronco implements Arvore
{
	List<Arvore> galhos;
	
	public Tronco()
	{
		this.galhos = new ArrayList<Arvore>();
	}

	@Override
	public void add(Arvore arvore)
	{
		this.galhos.add(arvore);
	}

	@Override
	public void remove(Arvore arvore)
	{
		this.galhos.remove(arvore);
	}

	@Override
	public void print()
	{
		System.out.println("Oi! eu sou um tronco.");
		for(Arvore galho: this.galhos)
		{
			galho.print();
		}
	}

}
