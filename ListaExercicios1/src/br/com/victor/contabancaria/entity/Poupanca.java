package br.com.victor.contabancaria.entity;

import br.com.victor.contabancaria.template.Conta;

public class Poupanca extends Conta
{
	@Override
	public Double calcularTaxa( Double valor )
	{
		return valor * 0.05;
	}

}
