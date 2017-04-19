package br.com.victor.bicicleta.entity;

public class Bicicleta
{
	public ModoDeAndar modoDeAndar;
	
	public void comoAndar( ModoDeAndar modoDeAndar )
	{
		this.modoDeAndar = modoDeAndar;
		this.modoDeAndar.comoAndar();
	}
}
