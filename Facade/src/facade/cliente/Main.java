package facade.cliente;

import facade.facade.SistemaFacade;

public class Main
{
	public static void main(String[] args)
	{
		//Modo paia
//		SistemaAudio audio = new SistemaAudio();
//		audio.configurarCanais();
//		audio.configurarFrequencia();
//		audio.configurarVolume();
//		audio.reproduzirAudio("rock n' roll.mp3");
//		
//		SistemaVideo video = new SistemaVideo();
//		video.configurarCores();
//		video.configurarResolucao();
//		video.renderizar("imagem.png");
//		
//		SistemaInput input = new SistemaInput();
//		input.configurarTeclado();
//		input.configurarJoystick();
//		input.lerInput("K");
		
		//Modo Facade
		
		SistemaFacade sistema = new SistemaFacade();
		
		sistema.reproduzirAudio("Rock N' Roll.mp3");
		sistema.renderizarImagem("image.png");
		sistema.lerInput("T");
	}
}
