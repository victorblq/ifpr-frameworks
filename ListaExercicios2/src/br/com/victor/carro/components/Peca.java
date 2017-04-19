package br.com.victor.carro.components;

import java.util.ArrayList;
import java.util.List;

public class Peca implements IPeca
{
	private String nome;

	private List<IPeca> pecasFilhas;
	
	public Peca(String nome)
	{
		this.nome = nome;
		this.pecasFilhas = new ArrayList<IPeca>();
	}
	
	@Override
	public void add(IPeca peca)
	{
		this.pecasFilhas.add(peca);
	}

	@Override
	public void remove(IPeca peca)
	{
		this.pecasFilhas.remove(peca);
	}

	@Override
	public void print()
	{
		System.out.println("Eu sou a peça: "+this.nome);
		for(IPeca peca: this.pecasFilhas)
		{
			peca.print();
		}
	}
}
