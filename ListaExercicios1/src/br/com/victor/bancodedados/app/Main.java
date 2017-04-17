package br.com.victor.bancodedados.app;

import br.com.victor.bancodedados.singleton.ConexaoSingleton;

public class Main
{
	public static void main(String[] args)
	{
		ConexaoSingleton conexaoSingleton = ConexaoSingleton.getInstance();
		conexaoSingleton.conectar();
		
		conexaoSingleton.buscar();
		
		conexaoSingleton.desconectar();
	}
}
