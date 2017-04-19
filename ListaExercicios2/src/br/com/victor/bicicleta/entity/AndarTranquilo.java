package br.com.victor.bicicleta.entity;

public class AndarTranquilo implements ModoDeAndar
{

	@Override
	public void comoAndar()
	{
		System.out.println("Andando tranquilo");
	}
	
}
