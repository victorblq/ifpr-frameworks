package br.com.victor.mensagens.strategy;

import br.com.victor.mensagens.entity.IMensagem;

public class Mensageiro
{
	private IMensagem mensagem;
	
	public Mensageiro(IMensagem mensagem)
	{
		this.mensagem = mensagem;
	}
	
	public void enviar(String mensagem, String para)
	{
		this.mensagem.enviar(mensagem, para);
	}
}
