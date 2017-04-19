package br.com.victor.viagemespacial.baseterrestre;

import br.com.victor.viagemespacial.viagem.IViagem;

public class Inglaterra implements IBaseTerrestre
{

	@Override
	public void update(IViagem viagem)
	{
		System.out.println("England received a message");
		System.out.println( viagem.getOcorrencia().notificarOcorrencia() );
	}

}
