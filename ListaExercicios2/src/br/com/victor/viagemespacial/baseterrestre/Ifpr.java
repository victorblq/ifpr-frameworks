package br.com.victor.viagemespacial.baseterrestre;

import br.com.victor.viagemespacial.viagem.IViagem;

public class Ifpr implements IBaseTerrestre
{

	@Override
	public void update(IViagem viagem)
	{
		System.out.println("IFPR Foz recebeu uma mensagem");
		System.out.println( viagem.getOcorrencia().notificarOcorrencia() );
	}

}
