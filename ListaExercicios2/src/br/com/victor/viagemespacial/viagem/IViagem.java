package br.com.victor.viagemespacial.viagem;

import br.com.victor.viagemespacial.baseterrestre.IBaseTerrestre;
import br.com.victor.viagemespacial.ocorrencia.IOcorrencia;

public interface IViagem
{
	public IOcorrencia getOcorrencia();
	public void updateOcorrencia( IOcorrencia ocorrencia );
	public void addBaseTerrestre( IBaseTerrestre baseTerrestre );
	public void notifyOcorrencia();
}
