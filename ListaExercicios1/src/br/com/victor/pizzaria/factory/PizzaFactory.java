package br.com.victor.pizzaria.factory;

import br.com.victor.pizzaria.entity.Bacon;
import br.com.victor.pizzaria.entity.Calabresa;
import br.com.victor.pizzaria.entity.Frango;
import br.com.victor.pizzaria.entity.IPizza;
import br.com.victor.pizzaria.entity.SaborPizza;
import br.com.victor.pizzaria.entity.Tamanho;

public class PizzaFactory implements IPizzaFactory
{

	@Override
	public IPizza fazerPizza(SaborPizza saborPizza, Tamanho tamanho)
	{
		if(tamanho.equals(Tamanho.ZERO))
		{
			System.out.println("Tamanho inválido");
			return null;
		}
		else
		{
			IPizza pizza = null;
			
			switch (saborPizza)
			{
			case CALABRESA:
				pizza = new Calabresa(tamanho);
				break;
			case FRANGO:
				pizza = new Frango(tamanho);
				break;
			case BACON:
				pizza = new Bacon(tamanho);
				break;
			default:
				System.out.println("Sabor não disponível!");
				break;
			}
			
			return pizza;
		}
	}

}
