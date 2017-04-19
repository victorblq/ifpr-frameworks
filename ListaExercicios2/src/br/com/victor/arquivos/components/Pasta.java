package br.com.victor.arquivos.components;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements IArquivo
{
	private String nome;
	
	private List<IArquivo> arquivos;
	
	public Pasta(String nome)
	{
		this.nome = nome;
		this.arquivos = new ArrayList<IArquivo>();
	}

	@Override
	public void add(IArquivo arquivo)
	{
		this.arquivos.add( arquivo );
	}

	@Override
	public void remove(IArquivo arquivo)
	{
		this.arquivos.remove( arquivo );
	}

	@Override
	public void printArquivo()
	{
		System.out.println("Eu sou uma pasta, meu nome é: "+ this.nome +" e tenho isso dentro de mim:");
		for(IArquivo arquivo: this.arquivos)
		{
			arquivo.printArquivo();
		}
	}

}
