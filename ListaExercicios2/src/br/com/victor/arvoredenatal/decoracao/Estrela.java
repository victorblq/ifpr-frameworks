package br.com.victor.arvoredenatal.decoracao;

import br.com.victor.arvoredenatal.arvore.Arvore;
import br.com.victor.arvoredenatal.arvore.Decoracao;

public class Estrela extends Decoracao
{
	private Arvore arvore;

	public Estrela(Arvore arvore)
	{
		this.arvore = arvore;
	}
	
	public void showEnfeites()
	{
		System.out.println("Sou uma estrela");
		this.arvore.showEnfeites();
	}

}
