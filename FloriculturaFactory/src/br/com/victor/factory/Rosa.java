package br.com.victor.factory;

import br.com.victor.entity.IFlor;

public class Rosa implements IFlor
{

	@Override
	public void getNomeFlor()
	{
		System.out.println("Rosa");
	}

}
