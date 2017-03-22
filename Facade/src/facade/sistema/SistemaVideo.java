package facade.sistema;

public class SistemaVideo
{
	public void configurarCores()
	{
		System.out.println("Configurando cores...");
	}
	
	public void configurarResolucao()
	{
		System.out.println("Configurando resolução...");
	}
	
	public void renderizar(String imagem)
	{
		System.out.println("A imagem: "+ imagem + " foi renderizada.");
	}
}
