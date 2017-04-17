package br.com.victor.template.cafeteria.bebida;

public abstract class BebidaCafeinada
{
	//Template Method
	public final void preparar()
	{
		this.esquentarAgua();
		this.misturar();
		this.colocarNoRecipiente();
		this.addCondimento();
	}
	
	public void esquentarAgua()
	{
		System.out.println("Esquentando agua");
	}
	
	public void colocarNoRecipiente()
	{
		System.out.println("Colocando no recipiente");
	}
	
	public abstract void misturar();
	
	public abstract void addCondimento();
}
