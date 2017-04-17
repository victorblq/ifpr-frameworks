package br.com.victor.pizzaria.factory;

import br.com.victor.pizzaria.entity.IPizza;
import br.com.victor.pizzaria.entity.SaborPizza;
import br.com.victor.pizzaria.entity.Tamanho;

public interface IPizzaFactory
{
	public IPizza fazerPizza(SaborPizza saborPizza, Tamanho tamanho);
}
