package br.com.victor.decorator.ingrediente;

import br.com.victor.decorator.bebida.Bebida;
import br.com.victor.decorator.bebida.BebidaDecorator;

public class Leite extends BebidaDecorator
{
	private Bebida bebida;
	
	public Leite(Bebida bebida)
	{
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao()
	{
		return this.bebida.getDescricao() + " + Leite";
	}

	@Override
	public double calcularPreco()
	{
		return this.bebida.calcularPreco() + 1.00;
	}

}
