package br.com.victor.viagemespacial.baseterrestre;

import br.com.victor.viagemespacial.viagem.IViagem;

public class Australia implements IBaseTerrestre
{

	@Override
	public void update(IViagem viagem)
	{
		System.out.println("Australia received a message");
		System.out.println( viagem.getOcorrencia().notificarOcorrencia() );
	}

}
