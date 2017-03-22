package cliente;

import factory.FabricaCarro;
import factory.ICarro;
import factory.IFabricaCarro;

public class Cliente
{
	public static void main(String[] args)
	{
		IFabricaCarro fabricaCarro = new FabricaCarro();
		
		ICarro carro = fabricaCarro.fabricarCarro("Palio");
		carro.exibirDetalhes();
		
		carro = fabricaCarro.fabricarCarro("POrscHE");
		carro.exibirDetalhes();
	}
}
