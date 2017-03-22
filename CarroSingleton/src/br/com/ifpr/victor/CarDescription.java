package br.com.ifpr.victor;

import java.util.HashMap;
import java.util.Map;

public class CarDescription {
	
	private static CarDescription instance;
	
	private Map<String, Carro> carros = new HashMap<String, Carro>();
	
	private CarDescription()
	{
		this.carros.put("palio", new Carro("Fiat", "Palio", "Vermelho", 1997));
		this.carros.put("corsa", new Carro("Chevrolet", "Corsa", "Verde", 1998));
		this.carros.put("celta", new Carro("Chevrolet", "Celta", "Prata", 2004));
		this.carros.put("gol", new Carro("Volkswagen", "Gol", "Preto", 2000));
	}
	
	public static CarDescription getInstance()
	{
		if(instance == null)
		{
			instance = new CarDescription();
			return instance;
		}
		else
		{
			return instance;
		}
	}
	
	public String getCarDescription(String key)
	{
		return this.carros.get(key).toString();
	}
}
