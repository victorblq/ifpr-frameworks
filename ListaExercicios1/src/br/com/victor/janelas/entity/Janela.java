package br.com.victor.janelas.entity;

import java.util.ArrayList;
import java.util.List;

public class Janela implements IJanela
{
	private String nome;
	
	public List<IJanela> janelasFilhas;
	
	public Janela(String nome)
	{
		this.nome = nome;
		this.janelasFilhas = new ArrayList<IJanela>();
	}
	
	@Override
	public void addJanelaFilha(IJanela janela)
	{
		this.janelasFilhas.add( janela );
	}
	
	@Override
	public void fecharJanelaFilha(IJanela janela)
	{
		this.janelasFilhas.remove( janela );
	}

	@Override
	public void maximizar()
	{
		System.out.println("Maximizando janela " + this.nome);
	}

	@Override
	public void minimizar()
	{
		System.out.println("Minimizando janela " + this.nome);

	}

	@Override
	public void mover()
	{
		System.out.println("Movendo janela " + this.nome);
	}

	@Override
	public List<IJanela> getJanelasFilhas()
	{
		return this.janelasFilhas;
	}
	
	@Override
	public void print()
	{
		System.out.println("Janela: " + this.nome);
		
		for(IJanela janela: this.janelasFilhas)
		{
			janela.print();
		}
	}


}
