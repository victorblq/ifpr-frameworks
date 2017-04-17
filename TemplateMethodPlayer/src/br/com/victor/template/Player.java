package br.com.victor.template;

public abstract class Player
{
	public final void playar()
	{
		this.tocar();
		this.avancar();
		this.parar();
	}
	
	public void avancar()
	{
		System.out.println("Avançar musica...");
	}
	
	public void parar()
	{
		System.out.println("Parou!");
	}
	
	public abstract void tocar();
}
