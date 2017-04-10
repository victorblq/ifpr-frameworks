package br.com.victor.composite.main;

import br.com.victor.composite.component.Arvore;
import br.com.victor.composite.composite.Galho;
import br.com.victor.composite.composite.Tronco;
import br.com.victor.composite.leaf.Folha;

public class Main
{
	public static void main(String[] args)
	{
		//Tronco
		Arvore tronco = new Tronco();
		
		//Galhos
		Arvore galho1 = new Galho();
		Arvore galho2 = new Galho();
		
		//Folhas
		Arvore folha1 = new Folha();
		Arvore folha2 = new Folha();
		Arvore folha3 = new Folha();
		
		//Add 3 folhas no galho2
		galho2.add(folha1);
		galho2.add(folha2);
		galho2.add(folha3);
		
		//Add galho2 no galho1
		galho1.add(galho2);
		
		tronco.add(galho1);
		tronco.print();
	}
}
