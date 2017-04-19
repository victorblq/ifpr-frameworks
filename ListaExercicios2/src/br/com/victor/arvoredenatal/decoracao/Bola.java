package br.com.victor.arvoredenatal.decoracao;

import br.com.victor.arvoredenatal.arvore.Arvore;

public class Bola extends Arvore
{
	private Arvore arvore;
	
	public Bola(Arvore arvore)
	{
		this.arvore = arvore;
	}
	
	@Override
	public void showEnfeites()
	{
		System.out.println("Sou uma bola");
		this.arvore.showEnfeites();
	}

}
