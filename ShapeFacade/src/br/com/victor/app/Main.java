package br.com.victor.app;

import br.com.victor.facade.ShapeMaker;

public class Main 
{

	public static void main(String[] args) 
	{
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.eraseCircle();
		shapeMaker.eraseRectangle();
		shapeMaker.eraseSquare();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		
		shapeMaker.eraseCircle();
		shapeMaker.eraseRectangle();
		shapeMaker.eraseSquare();
	}

}
