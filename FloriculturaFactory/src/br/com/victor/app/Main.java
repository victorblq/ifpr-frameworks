package br.com.victor.app;

import br.com.victor.entity.IFlor;
import br.com.victor.entity.TipoFlor;
import br.com.victor.factory.FlorFactory;

public class Main
{
	public static void main(String[] args)
	{
		FlorFactory florFactory = new FlorFactory();
		
		IFlor margarida = florFactory.criarFlor(TipoFlor.MARGARIDA);
		margarida.getNomeFlor();
		
		IFlor orquidea = florFactory.criarFlor(TipoFlor.ORQUIDEA);
		orquidea.getNomeFlor();
		
		IFlor crisantemo = florFactory.criarFlor(TipoFlor.CRISANTEMO);
		crisantemo.getNomeFlor();
		
		IFlor rosa = florFactory.criarFlor(TipoFlor.ROSA);
		rosa.getNomeFlor();
	}
}
