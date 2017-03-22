package facade.facade;

import facade.sistema.SistemaAudio;
import facade.sistema.SistemaInput;
import facade.sistema.SistemaVideo;

//Facade
public class SistemaFacade
{
	private SistemaAudio audio;
	private SistemaVideo video;
	private SistemaInput input;
	
	public SistemaFacade()
	{
		this.audio = new SistemaAudio();
		this.audio.configurarCanais();
		this.audio.configurarFrequencia();
		this.audio.configurarVolume();
		
		this.video = new SistemaVideo();
		this.video.configurarCores();
		this.video.configurarResolucao();
		
		this.input = new SistemaInput();
		this.input.configurarTeclado();
		this.input.configurarJoystick();
	}
	
	public void reproduzirAudio(String audio)
	{
		this.audio.reproduzirAudio(audio);
	}
	
	public void renderizarImagem(String imagem)
	{
		this.video.renderizar(imagem);
	}
	
	public void lerInput(String input)
	{
		this.input.lerInput(input);
	}
}
