package br.com.victor.banco.system;

import br.com.victor.banco.entity.Conta;

public class BancoFacade
{
	BancoSystem bancoSystem;
	
	public BancoFacade()
	{
		this.bancoSystem = new BancoSystem();
	}
	
	public Conta sacar( Conta conta, Double valor )
	{
		System.out.println("Digite sua senha");
		System.out.println("******");
		
		if( conta.getSenha().equals("******") )
		{
			this.bancoSystem.sacar(conta, valor);
		}
		else
		{
			System.out.println("Senha incorreta");
		}
		return conta;
	}
	
	public Conta depositar( Conta conta, Double valor )
	{
		System.out.println("Digite sua senha");
		System.out.println("******");
		
		if( conta.getSenha().equals("******") )
		{
			this.bancoSystem.depositar( conta, valor );
		}
		else
		{
			System.out.println("Senha incorreta");
		}
		return conta;
	}
	
	public Conta consultarSaldo( Conta conta )
	{
		System.out.println("Digite sua senha");
		System.out.println("******");
		
		if( conta.getSenha().equals("******") )
		{
			this.bancoSystem.consultarSaldo( conta );
		}
		else
		{
			System.out.println("Senha incorreta");
		}
		return conta;
	}
	
	public Conta pagarBoleto( Conta conta, Double valor )
	{
		System.out.println("Digite sua senha");
		System.out.println("******");
		
		if( conta.getSenha().equals("******") )
		{
			this.bancoSystem.pagarBoleto(conta, valor);
		}
		else
		{
			System.out.println("Senha incorreta");
		}
		return conta;
	}
}
