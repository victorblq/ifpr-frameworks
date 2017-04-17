package br.com.victor.pizzaria.app;

import br.com.victor.pizzaria.entity.IPizza;
import br.com.victor.pizzaria.entity.SaborPizza;
import br.com.victor.pizzaria.entity.Tamanho;
import br.com.victor.pizzaria.factory.PizzaFactory;

public class Main
{
	public static void main(String[] args)
	{
		PizzaFactory pizzaFactory = new PizzaFactory();
		
		IPizza pizza1 = pizzaFactory.fazerPizza(SaborPizza.CALABRESA, Tamanho.PEQUENA);
		if(pizza1 != null)
		{
			System.out.println("Pizza 1:");
			System.out.println(pizza1.getPizzaFull());
			System.out.println(pizza1.getIngredientes());
		}
		
		IPizza pizza2 = pizzaFactory.fazerPizza(SaborPizza.CALABRESA, Tamanho.MEDIA);
		if(pizza2 != null)
		{
			System.out.println("Pizza 2:");
			System.out.println(pizza2.getPizzaFull());
			System.out.println(pizza2.getIngredientes());
		}
		
		IPizza pizza3 = pizzaFactory.fazerPizza(SaborPizza.FRANGO, Tamanho.PEQUENA);
		if(pizza3 != null)
		{
			System.out.println("Pizza 3;");
			System.out.println(pizza3.getPizzaFull());
			System.out.println(pizza3.getIngredientes());
		}
		
		IPizza pizza4 = pizzaFactory.fazerPizza(SaborPizza.BACON, Tamanho.PEQUENA);
		if(pizza4 != null)
		{
			System.out.println("Pizza 4;");
			System.out.println(pizza4.getPizzaFull());
			System.out.println(pizza4.getIngredientes());
		}
	}
}
