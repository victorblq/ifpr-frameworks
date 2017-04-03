package br.com.victor.factory;

import br.com.victor.entity.IFlor;
import br.com.victor.entity.Orquidea;
import br.com.victor.entity.TipoFlor;

public class FlorFactory implements Factory
{

	@Override
	public IFlor criarFlor(TipoFlor tipoFlor)
	{
		IFlor flor = null;
		switch(tipoFlor)
		{
			case ORQUIDEA:
				flor = new Orquidea();
				break;
			case CRISANTEMO:
				flor = new Crisantemo();
				break;
			case MARGARIDA:
				flor = new Margarida();
				break;
			case ROSA:
				flor = new Rosa();
				break;
		}
		
		return flor;
	}

}
