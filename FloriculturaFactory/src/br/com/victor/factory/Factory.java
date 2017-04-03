package br.com.victor.factory;

import br.com.victor.entity.IFlor;
import br.com.victor.entity.TipoFlor;

public interface Factory
{
	public IFlor criarFlor(TipoFlor tipoFlor);
}
