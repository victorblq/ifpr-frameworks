package br.com.victor.workers.entity;

import br.com.victor.workers.template.Worker;

public class Postman extends Worker
{

	@Override
	public void work()
	{
		System.out.println("Postman is working...");
	}

	@Override
	public void relax()
	{
		return;
	}

}
