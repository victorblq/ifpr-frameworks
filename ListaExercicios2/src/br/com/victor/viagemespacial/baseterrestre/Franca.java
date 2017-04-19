package br.com.victor.viagemespacial.baseterrestre;

import br.com.victor.viagemespacial.viagem.IViagem;

public class Franca implements IBaseTerrestre
{

	@Override
	public void update(IViagem viagem)
	{
		System.out.println("La France a reçu un message");
		System.out.println( viagem.getOcorrencia().notificarOcorrencia() );
	}

}
