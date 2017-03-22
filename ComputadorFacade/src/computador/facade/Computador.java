package computador.facade;

import computador.facade.services.Cpu;
import computador.facade.services.HardDrive;
import computador.facade.services.Memory;

public class Computador
{
	private Cpu cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public Computador()
	{
		this.cpu = new Cpu();
		this.cpu.initialize();
		
		this.memory = new Memory();
		this.memory.initialize();
		
		this.hardDrive = new HardDrive();
		this.hardDrive.initialize();
	}
	
	public void alocateMemoryToOperatingSystem(Long size)
	{
		this.memory.alocateMemoryToOperatingSystem(size);
	}

	public void readOperatingSystemFromHardDrive(String operatingSystem)
	{
		this.hardDrive.readOperatingSystem(operatingSystem);
	}

	public void renderWellcomescreen()
	{
		System.out.println("Welcome!");
	}

}
