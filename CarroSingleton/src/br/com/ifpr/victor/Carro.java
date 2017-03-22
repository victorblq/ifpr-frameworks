package br.com.ifpr.victor;

public class Carro 
{
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	
	public Carro(String marca, String modelo, String cor, int ano)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	@Override
	public String toString(){
		return "Marca: "+this.marca+" | Modelo: "+this.modelo+" | Cor: "+this.cor+" | Ano: "+this.ano;
	}
}
