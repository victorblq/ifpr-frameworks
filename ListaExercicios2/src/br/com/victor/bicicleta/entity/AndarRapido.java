package br.com.victor.bicicleta.entity;

public class AndarRapido implements ModoDeAndar
{

	@Override
	public void comoAndar()
	{
		System.out.println("Andando rapido");
	}
}
