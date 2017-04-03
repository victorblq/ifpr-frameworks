package br.com.victor.entity;

public class Square implements Shape {

	private boolean isDrawed = false;
	
	@Override
	public void draw() {
		System.out.println("Drawing a square!");
		this.setDrawed(true);
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
			System.out.println("Square is not drawed!");
		}
	}

	@Override
	public void setDrawed(boolean drawed)
	{
		this.isDrawed = drawed;
	}

}
