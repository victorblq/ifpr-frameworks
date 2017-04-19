package br.com.victor.arvoredenatal.app;

import br.com.victor.arvoredenatal.arvore.Arvore;
import br.com.victor.arvoredenatal.arvore.ArvoreNatal;
import br.com.victor.arvoredenatal.decoracao.Bola;
import br.com.victor.arvoredenatal.decoracao.Estrela;

public class App
{
	public static void main(String[] args)
	{
		Arvore arvoreNatal = new ArvoreNatal();
		arvoreNatal.showEnfeites();
		System.out.println("\n");
		arvoreNatal = new Estrela(arvoreNatal);
		arvoreNatal.showEnfeites();
		System.out.println("\n");
		arvoreNatal = new Bola(arvoreNatal);
		arvoreNatal.showEnfeites();
		System.out.println("\n");
		arvoreNatal = new PiscaPisca(arvoreNatal);
		arvoreNatal.showEnfeites();
	}
}
