package br.com.victor.workers.template;

public abstract class Worker
{
	public final void dailyRoutine()
	{
		this.getUp();
		this.eatBreakfast();
		this.goToWork();
		this.work();
		this.returnToHome();
		this.relax();
		this.sleep();
	}

	public void getUp()
	{
		System.out.println("Get up");
	}

	public void eatBreakfast()
	{
		System.out.println("Eat Breakfast");
	}
	
	public void goToWork()
	{
		System.out.println("Go to work");
	}
	
	public abstract void work();
	
	public void returnToHome()
	{
		System.out.println("Return to home");
	}
	
	public abstract void relax();
	
	public void sleep()
	{
		System.out.println("Sleep");
	}
}
