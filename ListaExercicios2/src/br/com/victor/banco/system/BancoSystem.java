package br.com.victor.banco.system;

import br.com.victor.banco.entity.Conta;

public class BancoSystem 
{
	protected Conta sacar( Conta conta, Double valor )
	{
		if( conta.getSaldo() > valor )
		{
			conta.setSaldo( conta.getSaldo() - valor );
			System.out.println("Saque efetuado com sucesso!");
		}
		else
		{
			System.out.println("Saldo insuficiente para o saque!");
		}
		
		return conta;
	}

	protected Conta depositar(Conta conta, Double valor)
	{
		conta.setSaldo( conta.getSaldo() + valor );
		System.out.println("Depósito efetuado com sucesso!");
		return conta;
	}

	protected Conta consultarSaldo( Conta conta )
	{
		System.out.println( "Seu saldo é: " + conta.getSaldo() );
		return conta;
	}

	protected Conta pagarBoleto(Conta conta, Double valor)
	{
		if( conta.getSaldo() > valor )
		{
			conta.setSaldo( conta.getSaldo() - valor );
			System.out.println("Pagamento efetuado com sucesso!");
		}
		else
		{
			System.out.println("Pagamento não efetuado, saldo insuficiente!");
		}
		return conta;
	}
}
