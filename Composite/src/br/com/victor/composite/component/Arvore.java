package br.com.victor.composite.component;

//Component
public interface Arvore
{
	public void add(Arvore arvore);
	public void remove(Arvore arvore);
	public void print();
}
