package br.com.victor.arvoredenatal.app;

import br.com.victor.arvoredenatal.arvore.Arvore;

public class PiscaPisca extends Arvore
{
	private Arvore arvore;
	
	public PiscaPisca(Arvore arvore)
	{
		this.arvore = arvore;
	}
	
	@Override
	public void showEnfeites()
	{
		System.out.println("Sou um pisca pisca");
		this.arvore.showEnfeites();
	}

}
