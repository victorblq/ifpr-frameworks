package br.com.victor.turista.entity;

public class Uber implements ITransporte
{

	@Override
	public void mostrarDetalhes()
	{
		System.out.println("Uber custa 15 reais e leva 15 Minutos");
	}

}
