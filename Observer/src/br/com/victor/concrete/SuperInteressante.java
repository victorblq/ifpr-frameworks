package br.com.victor.concrete;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.entity.Assinante;
import br.com.victor.entity.Revista;

public class SuperInteressante implements Revista
{
	private List<Assinante> assinantes;
	private boolean isNovaEdicao;

	public SuperInteressante()
	{
		this.assinantes = new ArrayList<Assinante>();
	}
	
	@Override
	public void addAssinante( Assinante assinante )
	{
		this.assinantes.add( assinante );
	}

	@Override
	public void notifyAssinantes()
	{
		for( Assinante assinante: this.assinantes )
		{
			assinante.update( this );
		}
	}
	
	public void temNovaEdicao( boolean isNovaEdicao )
	{
		this.isNovaEdicao = isNovaEdicao;
		this.notifyAssinantes();
	}
	
	public boolean getEdicao()
	{
		return this.isNovaEdicao;
	}
	

}
