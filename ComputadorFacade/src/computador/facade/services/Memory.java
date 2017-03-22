package computador.facade.services;

public class Memory
{

	public void initialize()
	{
		System.out.println("Initializing memory...");
	}

	public void alocateMemoryToOperatingSystem(Long size)
	{
		System.out.println("Alocating " + size + " bytes of memory for operating system...");
	}

}
