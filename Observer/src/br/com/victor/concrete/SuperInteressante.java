package br.com.victor.concrete;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.entity.Assinante;
import br.com.victor.entity.Revista;

public class SuperInteressante implements Revista
{
	private List<Assinante> assinantes;

	public SuperInteressante()
	{
		this.assinantes = new ArrayList<Assinante>();
	}
	
	@Override
	public void addAssinante()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyAssinantes()
	{
		for( Assinante assinante: this.assinantes )
		{
			assinante.updateRevista( this );
		}
	}

}
