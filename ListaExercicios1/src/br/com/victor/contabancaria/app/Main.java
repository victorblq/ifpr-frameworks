package br.com.victor.contabancaria.app;

import br.com.victor.contabancaria.entity.Corrente;
import br.com.victor.contabancaria.entity.Poupanca;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Poupança:");
		Poupanca poupanca = new Poupanca();
		poupanca.depositar(100D);
		System.out.println( "Saldo da poupança: " + poupanca.getSaldo() );
		poupanca.sacar(10D);
		System.out.println( "Saldo da poupança: " + poupanca.getSaldo() );
		
		System.out.println("\n");
		
		System.out.println("Corrente:");
		Corrente corrente = new Corrente();
		corrente.depositar(100D);
		System.out.println( "Saldo da corrente: " + corrente.getSaldo() );
		corrente.sacar(10D);
		System.out.println( "Saldo da corrente: " + corrente.getSaldo() );
		
	}
}
