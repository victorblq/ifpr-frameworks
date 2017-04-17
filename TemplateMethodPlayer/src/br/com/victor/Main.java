package br.com.victor;

import br.com.victor.entity.Mp3;
import br.com.victor.entity.Wav;

public class Main
{
	public static void main(String[] args)
	{
		Mp3 mp3 = new Mp3();
		mp3.playar();
		
		System.out.println("\n");
		
		Wav wav = new Wav();
		wav.playar();
	}
}
