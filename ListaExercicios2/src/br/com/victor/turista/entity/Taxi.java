package br.com.victor.turista.entity;

public class Taxi implements ITransporte
{

	@Override
	public void mostrarDetalhes()
	{
		System.out.println("Taxi custa 50 reais e leva 18 Minutos");
	}

}
