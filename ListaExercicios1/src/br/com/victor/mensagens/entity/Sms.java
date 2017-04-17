package br.com.victor.mensagens.entity;

public class Sms implements IMensagem
{
	@Override
	public void enviar(String mensagem, String para)
	{
		System.out.println( "Enviando mensagem sms: " + mensagem + " | Para: " + para );
	}
}
