package br.com.victor.composite.composite;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.composite.component.Arvore;

public class Galho implements Arvore
{
	private List<Arvore> folhas;
	
	public Galho()
	{
		this.folhas = new ArrayList<Arvore>();
	}

	@Override
	public void add(Arvore arvore)
	{
		this.folhas.add(arvore);
	}

	@Override
	public void remove(Arvore arvore)
	{
		this.folhas.remove(arvore);
	}

	@Override
	public void print()
	{
		System.out.println("Oi! eu sou um galho.");
		for(Arvore folha: this.folhas)
		{
			folha.print();
		}
	}
	
}
