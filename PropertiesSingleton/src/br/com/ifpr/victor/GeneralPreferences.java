package br.com.ifpr.victor;

import java.util.HashMap;
import java.util.Map;

public class GeneralPreferences 
{
	private static GeneralPreferences instance;
	
	private static Map<String, String> preferences;
	
	private GeneralPreferences()
	{
		preferences = new HashMap<String, String>();
		preferences.put("time-zone", "UTC-3");
		preferences.put("country", "Brazil");
		preferences.put("city", "Foz do Iguaçu");
		preferences.put("state", "Paraná");
		preferences.put("number", "135");
		preferences.put("zip-code", "85870-220");
		System.out.println("Preferences set!");
	}
	
	public static GeneralPreferences getInstance()
	{
		if(instance == null)
		{
			instance = new GeneralPreferences();
			return instance;
		}
		else
		{
			return instance;
		}
	}
	
	public String getPreference(String key)
	{
		return preferences.get(key);
	}
}
