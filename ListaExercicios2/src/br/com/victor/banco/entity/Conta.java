package br.com.victor.banco.entity;

public class Conta
{
	private Double saldo;
	private String senha = "******";
	
	public Conta( Double saldo )
	{
		this.saldo = saldo;
	}

	public String getSenha()
	{
		return senha;
	}

	public Double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(Double saldo)
	{
		this.saldo = saldo;
	}
	
}
