package br.com.victor.viagemespacial.app;

import br.com.victor.viagemespacial.baseterrestre.Australia;
import br.com.victor.viagemespacial.baseterrestre.China;
import br.com.victor.viagemespacial.baseterrestre.Franca;
import br.com.victor.viagemespacial.baseterrestre.Ifpr;
import br.com.victor.viagemespacial.baseterrestre.Inglaterra;
import br.com.victor.viagemespacial.baseterrestre.Nasa;
import br.com.victor.viagemespacial.ocorrencia.BuracoDeMinhoca;
import br.com.victor.viagemespacial.ocorrencia.ChuvaDeMeteoros;
import br.com.victor.viagemespacial.ocorrencia.Extraterrestres;
import br.com.victor.viagemespacial.ocorrencia.PousoEmPlaneta;
import br.com.victor.viagemespacial.viagem.Viagem;

public class App
{
	public static void main(String[] args)
	{
		Viagem viagem = new Viagem();
		
		viagem.addBaseTerrestre( new Nasa() );
		viagem.addBaseTerrestre( new Inglaterra() );
		viagem.addBaseTerrestre( new Franca() );
		viagem.addBaseTerrestre( new China() );
		viagem.addBaseTerrestre( new Australia() );
		viagem.addBaseTerrestre( new Ifpr() );

		viagem.updateOcorrencia( new BuracoDeMinhoca() );
		System.out.println("\n");
		viagem.updateOcorrencia( new ChuvaDeMeteoros() );
		System.out.println("\n");
		viagem.updateOcorrencia( new Extraterrestres() );
		System.out.println("\n");
		viagem.updateOcorrencia( new PousoEmPlaneta() );
	}
}
