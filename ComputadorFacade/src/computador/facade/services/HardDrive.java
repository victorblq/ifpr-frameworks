package computador.facade.services;

public class HardDrive
{

	public void initialize()
	{
		System.out.println("Initializing hard drive...");
	}

	public void readOperatingSystem(String operatingSystem)
	{
		System.out.println("Reading files of " + operatingSystem + " operating system...");
	}

}
