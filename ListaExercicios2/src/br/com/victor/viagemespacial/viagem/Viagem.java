package br.com.victor.viagemespacial.viagem;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.viagemespacial.baseterrestre.IBaseTerrestre;
import br.com.victor.viagemespacial.ocorrencia.IOcorrencia;

public class Viagem implements IViagem
{
	private List<IBaseTerrestre> bases;
	private IOcorrencia ocorrencia;
	
	public Viagem()
	{
		this.bases = new ArrayList<IBaseTerrestre>();
	}
	
	@Override
	public IOcorrencia getOcorrencia()
	{
		return this.ocorrencia;
	}

	@Override
	public void updateOcorrencia(IOcorrencia ocorrencia)
	{
		this.ocorrencia = ocorrencia;
		this.notifyOcorrencia();
	}

	@Override
	public void addBaseTerrestre(IBaseTerrestre baseTerrestre)
	{
		this.bases.add( baseTerrestre );
	}

	@Override
	public void notifyOcorrencia()
	{
		for(IBaseTerrestre baseTerrestre: this.bases)
		{
			baseTerrestre.update( this );
		}
	}

}
