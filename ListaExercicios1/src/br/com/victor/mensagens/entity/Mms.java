package br.com.victor.mensagens.entity;

public class Mms implements IMensagem
{
	@Override
	public void enviar(String mensagem, String para)
	{
		System.out.println( "Enviando mensagem mms: " + mensagem + " | Para: " + para );
	}
}
