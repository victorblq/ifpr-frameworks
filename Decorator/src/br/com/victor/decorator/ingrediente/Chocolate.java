package br.com.victor.decorator.ingrediente;

import br.com.victor.decorator.bebida.Bebida;
import br.com.victor.decorator.bebida.BebidaDecorator;

//Decorador concreto (Implementa o que o decorator pede)
public class Chocolate extends BebidaDecorator
{

	Bebida bebida;
	
	public Chocolate(Bebida bebida)
	{
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao()
	{
		return this.bebida.getDescricao() + " + Chocolate";
	}

	@Override
	public double calcularPreco()
	{
		return this.bebida.calcularPreco() + 2.00;
	}

}
