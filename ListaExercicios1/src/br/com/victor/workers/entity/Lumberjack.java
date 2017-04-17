package br.com.victor.workers.entity;

import br.com.victor.workers.template.Worker;

public class Lumberjack extends Worker
{

	@Override
	public void work()
	{
		System.out.println("Lumberjack is working...");
	}

	@Override
	public void relax()
	{
		return;
	}
	
}
