package br.com.victor.janelas.entity;

import java.util.List;

public interface IJanela
{
	public void addJanelaFilha(IJanela janela);
	public void fecharJanelaFilha(IJanela janela);
	public void maximizar();
	public void minimizar();
	public void mover();
	public void print();
	public List<IJanela> getJanelasFilhas();
}
