package br.com.victor.bancodedados.singleton;

public class ConexaoSingleton
{
	private static ConexaoSingleton instance;
	
	private ConexaoSingleton(){}
	
	public static ConexaoSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new ConexaoSingleton();
			return instance;
		}
		else
		{
			return instance;
		}
	}
	
	public void conectar()
	{
		System.out.println("Conectando ao banco de dados...");
		System.out.println("Conexão iniciada");
	}
	
	public void buscar()
	{
		System.out.println("Resultado da busca:");
		System.out.println("1 | Victor | Programador | IFPR");
		System.out.println("2 | Thiago | Programador | IFPR");
		System.out.println("3 | Igor   | Programador | IFPR");
	}
	
	public void desconectar()
	{
		System.out.println("Desconectando...");
		System.out.println("Conexão finalizada!");
	}
}
