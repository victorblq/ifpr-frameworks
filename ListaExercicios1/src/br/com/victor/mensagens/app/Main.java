package br.com.victor.mensagens.app;

import br.com.victor.mensagens.entity.Email;
import br.com.victor.mensagens.entity.Mms;
import br.com.victor.mensagens.entity.Sms;
import br.com.victor.mensagens.strategy.Mensageiro;

public class Main
{
	public static void main(String[] args)
	{
		Mensageiro mensageiro = new Mensageiro(new Sms());
		mensageiro.enviar("Oi Thiago", "Thiago");
		
		mensageiro = new Mensageiro(new Mms());
		mensageiro.enviar("Oi Pedro", "Pedro");
		
		mensageiro = new Mensageiro(new Email());
		mensageiro.enviar("Oi Paulo", "Paulo");
	}
}
