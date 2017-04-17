package br.com.victor.contabancaria.template;

public abstract class Conta
{
	private Double saldo = 0D;
	
	public void sacar( Double valor )
	{
		if(this.saldo > ( valor + this.calcularTaxa( valor ) ) )
		{
			this.saldo -= ( valor + this.calcularTaxa( valor ) );
			System.out.println("Saque efetuado com sucesso");
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
	

	public void depositar( Double valor  )
	{
		if( valor > this.calcularTaxa( valor ) )
		{
			this.saldo += ( valor - this.calcularTaxa( valor ) );
			System.out.println("Depósito realizado com sucesso");
		}
		else
		{
			System.out.println("Valor não deve ser menor que a taxa: "+this.calcularTaxa( valor ) );
		}
	}
	
	public Double getSaldo()
	{
		return this.saldo;
	}
	
	public abstract Double calcularTaxa( Double valor );
}
