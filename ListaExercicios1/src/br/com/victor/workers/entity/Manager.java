package br.com.victor.workers.entity;

import br.com.victor.workers.template.Worker;

public class Manager extends Worker
{

	@Override
	public void work()
	{
		System.out.println("Manager is working...");
	}

	@Override
	public void relax()
	{
		System.out.println("Manager is relaxing...");
	}

}
