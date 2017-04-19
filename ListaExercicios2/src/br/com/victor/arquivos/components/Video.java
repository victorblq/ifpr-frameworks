package br.com.victor.arquivos.components;

public class Video implements IArquivo
{
	private String nome;
	
	public Video( String nome )
	{
		this.nome = nome;
	}

	@Override
	public void add(IArquivo arquivo)
	{
		System.out.println("Não é possivel adicionar arquivos à um video!");
	}

	@Override
	public void remove(IArquivo arquivo)
	{
		System.out.println("Não é possivel remover arquivos de um video!");
	}

	@Override
	public void printArquivo()
	{
		System.out.println("Eu sou um vídeo e meu nome é: "+this.nome);
	}

}
