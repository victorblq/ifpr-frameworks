package br.com.victor.carro.app;

import br.com.victor.carro.components.Peca;

public class App
{
	public static void main(String[] args)
	{
		Peca carro = new Peca("Carro");
		Peca portaDireita = new Peca("Porta Direita");
		Peca portaEsquerda = new Peca("Porta Esquerda");
		Peca capo = new Peca("Capô");
		Peca motor = new Peca("Motor");
		Peca bancoMotorista = new Peca("Banco motorista");
		Peca bancoCaroneiro = new Peca("Banco caroneiro");
		Peca portaLuvas = new Peca("Porta luvas");
		Peca volante = new Peca("Volante");

		bancoCaroneiro.add(portaLuvas);
		bancoMotorista.add(volante);
		
		portaDireita.add(bancoCaroneiro);
		portaEsquerda.add(bancoMotorista);
		
		capo.add(motor);
		
		carro.add(portaDireita);
		carro.add(portaEsquerda);
		carro.add(capo);
		
		carro.print();
	}
}
