package br.com.ifpr.frameworks;

public class Main {

	public static void main(String[] args) {
		CalculadoraSingleton calculadora = CalculadoraSingleton.getInstance();
		
		System.out.println("Instancia de calculadora: " + calculadora.toString());
		System.out.println("=========SOMA SINGLETON========");
		System.out.println(calculadora.somar(2, 2));
		System.out.println("Instancia de calculadora: " + calculadora.toString());
		
		System.out.println("=========SUBTRAÇÃO SINGLETON========");
		System.out.println(calculadora.subtrair(4, 2));
		System.out.println("Instancia de calculadora: " + calculadora.toString());
		
	}

}
