package br.com.victor.workers.app;

import br.com.victor.workers.entity.FireFighter;
import br.com.victor.workers.entity.Lumberjack;
import br.com.victor.workers.entity.Manager;
import br.com.victor.workers.entity.Postman;

public class Main
{
	public static void main(String[] args)
	{
		FireFighter fireFighter = new FireFighter();
		fireFighter.dailyRoutine();
		
		System.out.println("\n");
		
		Lumberjack lumberjack = new Lumberjack();
		lumberjack.dailyRoutine();
		
		System.out.println("\n");
		
		Postman postman = new Postman();
		postman.dailyRoutine();
		
		System.out.println("\n");
		
		Manager manager = new Manager();
		manager.dailyRoutine();
		
		System.out.println("\n");
	}
}
