package br.com.victor.arquivos.app;

import br.com.victor.arquivos.components.Audio;
import br.com.victor.arquivos.components.Pasta;
import br.com.victor.arquivos.components.Video;

public class App
{
	public static void main(String[] args)
	{
		Pasta pasta1 = new Pasta("Pasta raíz");
		Pasta pasta2 = new Pasta("Pasta interior");
		
		Video video1 = new Video("Video 1");
		pasta1.add( video1 );
		
		Video video2 = new Video("Video 2");
		pasta2.add( video2 );
		
		Audio audio1 = new Audio("Audio 1");
		pasta2.add( audio1 );
		
		pasta1.add( pasta2 );
		
		pasta1.printArquivo();
		
		video1.add( new Video("Nao vai adicionar") );
	}
}
