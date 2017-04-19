package br.com.victor.arquivos.components;

public interface IArquivo
{
	public void add( IArquivo arquivo );
	
	public void remove( IArquivo arquivo );
	
	public void printArquivo();
}
