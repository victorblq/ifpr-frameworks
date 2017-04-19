package br.com.victor.turista.entity;

public class MeioDeTransporte
{
	private ITransporte transporte;
	
	public MeioDeTransporte(ITransporte transporte)
	{
		this.transporte = transporte;
	}
	
	public void mostrarDetalhes()
	{
		this.transporte.mostrarDetalhes();
	}

}
