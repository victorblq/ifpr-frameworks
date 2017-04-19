package br.com.victor.turista.entity;

public class Onibus implements ITransporte
{

	@Override
	public void mostrarDetalhes()
	{
		System.out.println("Onibus custa 3 reais e leva 45 Minutos");
	}

}
