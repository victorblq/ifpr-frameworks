package computador.client;

import computador.facade.Computador;

public class Main
{
	public static void main(String[] args)
	{
		Computador computador = new Computador();
		computador.alocateMemoryToOperatingSystem(1024L);
		computador.readOperatingSystemFromHardDrive("Linux");
		
		computador.renderWellcomescreen();
	}
}
