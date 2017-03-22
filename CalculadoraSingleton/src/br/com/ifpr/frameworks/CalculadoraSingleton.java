package br.com.ifpr.frameworks;
public class CalculadoraSingleton 
{
	private static CalculadoraSingleton instance;
	
	private CalculadoraSingleton(){}
	
	public static CalculadoraSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new CalculadoraSingleton();
			return instance;
		}
		else
		{
			return instance;
		}
	}
	
	public int somar(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public int subtrair(int num1, int num2)
	{
		return num1 - num2;
	}
	
}