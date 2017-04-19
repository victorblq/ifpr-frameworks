package br.com.victor.banco.app;

import br.com.victor.banco.entity.Conta;
import br.com.victor.banco.system.BancoFacade;

public class App
{
	public static void main(String[] args)
	{
		BancoFacade bancoFacade = new BancoFacade();
		Conta conta = new Conta( 1000D );
		
		bancoFacade.consultarSaldo(conta);
		
		bancoFacade.sacar(conta, 100D);
		bancoFacade.consultarSaldo( conta );

		bancoFacade.sacar(conta, 100D);
		bancoFacade.consultarSaldo( conta );

		bancoFacade.sacar(conta, 100D);
		bancoFacade.consultarSaldo( conta );
		
		bancoFacade.depositar(conta, 1000D);
		bancoFacade.consultarSaldo(conta);
		
		bancoFacade.pagarBoleto(conta, 500D);
		bancoFacade.consultarSaldo(conta);
	}
}
