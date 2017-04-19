package br.com.victor.turista.entity;

public class Limousine implements ITransporte
{

	@Override
	public void mostrarDetalhes()
	{
		System.out.println("Limousine custa 200 reais, leva 25 Minutos e tem champagne");
	}

}
