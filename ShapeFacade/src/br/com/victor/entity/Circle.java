package br.com.victor.entity;

public class Circle implements Shape {

	private boolean isDrawed = false;
	
	@Override
	public void draw() {
		System.out.println("Drawing a Circle!");
		this.setDrawed(true);
	}

	@Override
	public void erase()
	{
		if(this.isDrawed)
		{
			System.out.println("Erasing a Circle!");
			this.setDrawed(false);
		}
		else
		{
			System.out.println("Circle is not drawed!");
		}
	}

	@Override
	public void setDrawed(boolean drawed)
	{
		this.isDrawed = drawed;
	}
}
