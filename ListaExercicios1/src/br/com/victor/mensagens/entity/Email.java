package br.com.victor.mensagens.entity;

public class Email implements IMensagem
{
	@Override
	public void enviar(String mensagem, String para)
	{
		System.out.println( "Enviando mensagem de email: " + mensagem + " | Para: " + para );
	}

}
