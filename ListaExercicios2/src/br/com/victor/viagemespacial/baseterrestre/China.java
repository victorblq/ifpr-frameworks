package br.com.victor.viagemespacial.baseterrestre;

import br.com.victor.viagemespacial.viagem.IViagem;

public class China implements IBaseTerrestre
{

	@Override
	public void update(IViagem viagem)
	{
		System.out.println("中国收到消息");
		System.out.println( viagem.getOcorrencia().notificarOcorrencia() );
	}

}
