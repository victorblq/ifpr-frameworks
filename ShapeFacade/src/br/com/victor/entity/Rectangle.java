package br.com.victor.entity;

public class Rectangle implements Shape {

	private boolean isDrawed = false;
	
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle!");
		this.setDrawed(false);
	}

	@Override
	public void erase()
	{
		if(this.isDrawed)
		{
			System.out.println("Erasing a rectangle!");
			this.setDrawed(false);
		}
		else
		{
			System.out.println("Rectangle is not drawed!");
		}
	}

	@Override
	public void setDrawed(boolean drawed)
	{
		this.isDrawed = drawed;
	}

}
