package br.com.victor.arquivos.components;

public class Audio implements IArquivo
{
	private String nome;
	
	public Audio( String nome )
	{
		this.nome = nome;
	}

	@Override
	public void add(IArquivo arquivo)
	{
		System.out.println("Não é possivel adicionar arquivos à um audio!");
	}

	@Override
	public void remove(IArquivo arquivo)
	{
		System.out.println("Não é possivel remover arquivos de um audio!");
	}

	@Override
	public void printArquivo()
	{
		System.out.println("Eu sou um áudio e meu nome é: "+this.nome);
	}

}
