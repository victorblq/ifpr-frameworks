package br.com.victor.concrete;

import br.com.victor.entity.Assinante;
import br.com.victor.entity.Revista;

public class AssinanteSuperInteressante implements Assinante
{

	@Override
	public void update( Revista revista )
	{
		SuperInteressante superInteressante = ( SuperInteressante ) revista;
		System.out.println( "Tem nova edição?" + superInteressante.getEdicao() );
		
		
	}

}
