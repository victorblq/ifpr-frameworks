package rest;

import com.fasterxml.jackson.databind.JsonNode;

import play.Play;
import play.libs.Json;
import play.libs.WS;

public class RestClient
{
	private static final String URL = Play.application().configuration().getString("rest.service.address");
	
	private static RestClient instance;
	
	public static RestClient getInstance()
	{
		if(instance == null)
		{
			instance = new RestClient();
		}
		
		return instance;
	}
	
	public JsonNode list()
	{
		String response = WS.url(URL + "/pessoa")
				.get()
				.get().getBody();
		
		return Json.parse(response);
	}
	
	public String create(String nome, String sobrenome, String idade)
	{
		JsonNode json = Json.newObject()
				.put("nome", nome)
				.put("sobrenome", idade)
				.put("idade", idade);
		
		String response = WS.url(URL + "/pessoa/create")
				.post(json)
				.get()
				.getBody();
		
		return response;
	}
}