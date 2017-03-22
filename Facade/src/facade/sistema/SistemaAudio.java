package facade.sistema;

public class SistemaAudio
{
	public void configurarCanais()
	{
		System.out.println("Configurando canais...");
	}
	
	public void configurarFrequencia()
	{
		System.out.println("Configurando frequencia...");
	}
	
	public void configurarVolume()
	{
		System.out.println("Configurando volume...");
	}
	
	public void reproduzirAudio(String audio)
	{
		System.out.println("Reproduzindo audio: " + audio);
	}
}
