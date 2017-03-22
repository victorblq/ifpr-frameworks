package factory;

import carro.Gol;
import carro.Palio;
import carro.Porsche;

//Fabrica concreta
public class FabricaCarro implements IFabricaCarro
{

	@Override
	public ICarro fabricarCarro(String tipoCarro)
	{
		ICarro carro = null;
		
		if(tipoCarro.toUpperCase().equals("PALIO"))
		{
			carro = new Palio();
		}
		else if(tipoCarro.toUpperCase().equals("GOL"))
		{
			carro = new Gol();
		}
		else if(tipoCarro.toUpperCase().equals("PORSCHE"))
		{
			carro = new Porsche();
		}
		
		return carro;
	}

}
