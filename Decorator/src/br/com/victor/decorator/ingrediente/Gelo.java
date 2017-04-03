package br.com.victor.decorator.ingrediente;

import br.com.victor.decorator.bebida.Bebida;
import br.com.victor.decorator.bebida.BebidaDecorator;

public class Gelo extends BebidaDecorator
{
	private Bebida bebida;
	
	public Gelo(Bebida bebida)
	{
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao()
	{
		return this.bebida.getDescricao() + " + Gelo";
	}

	@Override
	public double calcularPreco()
	{
		return this.bebida.calcularPreco() + 1.00;
	}

}
