package br.com.victor.workers.entity;

import br.com.victor.workers.template.Worker;

public class FireFighter extends Worker
{

	@Override
	public void work()
	{
		System.out.println("Firefighter is working...");
	}

	@Override
	public void relax()
	{
		return;
	}

}
