package br.com.victor.turista.app;

import br.com.victor.turista.entity.Limousine;
import br.com.victor.turista.entity.MeioDeTransporte;
import br.com.victor.turista.entity.Onibus;
import br.com.victor.turista.entity.Taxi;
import br.com.victor.turista.entity.Uber;

public class App
{
	public static void main(String[] args)
	{
		MeioDeTransporte meioDeTransporte = new MeioDeTransporte( new Uber() );
		meioDeTransporte.mostrarDetalhes();
		
		meioDeTransporte = new MeioDeTransporte( new Taxi() );
		meioDeTransporte.mostrarDetalhes();
		
		meioDeTransporte = new MeioDeTransporte( new Onibus() );
		meioDeTransporte.mostrarDetalhes();
		
		meioDeTransporte = new MeioDeTransporte( new Limousine() );
		meioDeTransporte.mostrarDetalhes();
	}
}
