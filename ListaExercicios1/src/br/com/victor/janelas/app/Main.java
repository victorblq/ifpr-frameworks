package br.com.victor.janelas.app;

import br.com.victor.janelas.entity.IJanela;
import br.com.victor.janelas.entity.Janela;
import br.com.victor.janelas.gerenciador.Gerenciador;

public class Main
{
	public static void main(String[] args)
	{
		IJanela janela1 = new Janela("Janela 1");
		IJanela filha1janela1 = new Janela("Filha 1 da Janela 1");
		IJanela filha2janela1 = new Janela("Filha 2 da Janela 1");
		IJanela janela2 = new Janela("Janela 2");

		janela1.addJanelaFilha(filha1janela1);
		janela1.addJanelaFilha(filha2janela1);
		
		Gerenciador gerenciador = Gerenciador.getInstance();
		
		gerenciador.add(janela1);
		gerenciador.add(janela2);
		
		gerenciador.print();
		
		gerenciador.getJanelaPai().maximizar();
		gerenciador.getJanelaPai().getJanelasFilhas().get(0).minimizar();
		gerenciador.getJanelaPai().getJanelasFilhas().get(1).mover();
	}
}
