package br.com.victor.decorator.app;

import br.com.victor.decorator.bebida.Bebida;
import br.com.victor.decorator.bebida.CafeTradicional;
import br.com.victor.decorator.bebida.Suco;
import br.com.victor.decorator.ingrediente.Chocolate;
import br.com.victor.decorator.ingrediente.Gelo;
import br.com.victor.decorator.ingrediente.Leite;

public class ClienteBebida
{
	public static void main(String[] args)
	{
		Bebida cafe = new CafeTradicional();
		
		System.out.println("Bebida: " + cafe.getDescricao());
		System.out.println("Preço Total: " + cafe.calcularPreco());
		
		cafe = new Chocolate(new Leite(cafe));
		
		System.out.println("Bebida: " + cafe.getDescricao());
		System.out.println("Preço Total: " + cafe.calcularPreco());
		
		Bebida suco = new Suco();
		
		System.out.println("Bebida: " + suco.getDescricao());
		System.out.println("Preço Total: " + suco.calcularPreco());
		
		suco = new Gelo(suco);

		System.out.println("Bebida: " + suco.getDescricao());
		System.out.println("Preço Total: " + suco.calcularPreco());
		//Da pra fazer assim também
//		cafe = new Leite(cafe);
//		
//		System.out.println("Bebida: " + cafe.getDescricao());
//		System.out.println("Preço Total: " + cafe.calcularPreco());

	}
}
