package br.com.victor.decorator.bebida;

//Component
public abstract class Bebida
{
	private String descricao;
	
	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public abstract double calcularPreco();

}
