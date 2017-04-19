package br.com.victor.viagemespacial.ocorrencia;

public class PousoEmPlaneta implements IOcorrencia
{
	@Override
	public String notificarOcorrencia()
	{
		return "Atenção bases terrestres, temos uma ocorrencia de: "+this.getClass().getSimpleName();
	}
}
