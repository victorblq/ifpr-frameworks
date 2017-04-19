package br.com.victor.bicicleta.app;

import br.com.victor.bicicleta.entity.AndarRapido;
import br.com.victor.bicicleta.entity.AndarTranquilo;
import br.com.victor.bicicleta.entity.Bicicleta;

public class App
{
	public static void main(String[] args)
	{
		Bicicleta bicicleta = new Bicicleta( );
		
		bicicleta.comoAndar( new AndarTranquilo() );
		bicicleta.comoAndar( new AndarRapido() );
		bicicleta.comoAndar( new AndarTranquilo() );
		bicicleta.comoAndar( new AndarRapido() );
	}
}
