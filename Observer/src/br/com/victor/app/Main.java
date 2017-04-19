package br.com.victor.app;

import br.com.victor.concrete.AssinanteSuperInteressante;
import br.com.victor.concrete.SuperInteressante;
import br.com.victor.entity.Assinante;

public class Main
{
	public static void main(String[] args)
	{
		SuperInteressante revista = new SuperInteressante();
		Assinante assinante = new AssinanteSuperInteressante();
		revista.addAssinante( assinante );
		
		Assinante assinante2 = new AssinanteSuperInteressante();
		revista.addAssinante( assinante2 );
		
		revista.temNovaEdicao( true );
	}
	
}
