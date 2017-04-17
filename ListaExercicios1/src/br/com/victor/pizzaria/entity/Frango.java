package br.com.victor.pizzaria.entity;

import java.util.ArrayList;
import java.util.List;

public class Frango implements IPizza
{
	private final Double VALOR_BASE = 15D;
	
	private String nome = "Frango";
	
	private Tamanho tamanho;
	
	private List<String> ingredientes;
	
	public Frango(Tamanho tamanho)
	{
		this.tamanho = tamanho; 
		
		this.ingredientes = new ArrayList<String>();
		this.ingredientes.add("Massa");
		this.ingredientes.add("Queijo");
		this.ingredientes.add("Molho");
		this.ingredientes.add("Frango");
	}

	@Override
	public String getNomePizza()
	{
		return this.nome;
	}

	@Override
	public Double getValorPizza()
	{
		return this.VALOR_BASE * tamanho.ordinal();
	}
	
	@Override
	public String getIngredientes()
	{
		String ingredientes = "";
		for(String ingrediente: this.ingredientes)
		{
			ingredientes += ingrediente + "/";
		}
		
		return ingredientes;
	}

	@Override
	public String getPizzaFull()
	{
		return "Pizza de: "+this.nome+" | Tamanho: "+this.tamanho+" | Valor: "+this.getValorPizza();
	}

}
