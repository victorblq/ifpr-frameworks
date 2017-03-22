package facade.sistema;

public class SistemaInput
{
	public void configurarTeclado()
	{
		System.out.println("Configurando teclado...");
	}
	
	public void configurarJoystick()
	{
		System.out.println("Configurando joystick...");
	}
	
	public void lerInput(String input)
	{
		System.out.println("Tecla: "+input+ " pressionado.");
	}
}
