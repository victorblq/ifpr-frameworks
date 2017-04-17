package br.com.victor.janelas.gerenciador;

import br.com.victor.janelas.entity.IJanela;
import br.com.victor.janelas.entity.Janela;

public class Gerenciador
{
	private static Gerenciador instance;
	
	private IJanela janelaPai;
	
	private Gerenciador()
	{
		this.janelaPai = new Janela("Janela Pai");
	}
	
	public static Gerenciador getInstance()
	{
		if(instance == null)
		{
			instance = new Gerenciador();
			return instance;
		}
		else
		{
			return instance;
		}
	}
	
	public void add(IJanela janela)
	{
		this.janelaPai.addJanelaFilha( janela );
	}
	
	public void print()
	{
		this.janelaPai.print();
	}

	public IJanela getJanelaPai()
	{
		return this.janelaPai;
	}
}
