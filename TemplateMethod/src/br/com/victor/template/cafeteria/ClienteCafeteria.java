package br.com.victor.template.cafeteria;

import br.com.victor.template.cafeteria.bebida.Cafe;
import br.com.victor.template.cafeteria.bebida.Cha;

public class ClienteCafeteria
{
	public static void main(String[] args)
	{
		Cafe cafe = new Cafe();
		cafe.preparar();
		
		System.out.println("\n");
		
		Cha cha = new Cha();
		cha.preparar();
	}
}
