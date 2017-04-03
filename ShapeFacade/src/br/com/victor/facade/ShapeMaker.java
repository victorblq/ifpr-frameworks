package br.com.victor.facade;

import br.com.victor.entity.Circle;
import br.com.victor.entity.Rectangle;
import br.com.victor.entity.Shape;
import br.com.victor.entity.Square;

public class ShapeMaker 
{
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker()
	{
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
	}
	
	public void drawCircle()
	{
		this.circle.draw();
	}
	
	public void eraseCircle()
	{
		this.circle.erase();
	}
	
	public void drawRectangle()
	{
		this.rectangle.draw();
	}
	
	public void eraseRectangle()
	{
		this.rectangle.erase();
	}
	
	public void drawSquare()
	{
		this.square.draw();
	}
	
	public void eraseSquare()
	{
		this.square.erase();
	}
	
}
