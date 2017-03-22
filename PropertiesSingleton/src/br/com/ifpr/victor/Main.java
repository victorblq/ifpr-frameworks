package br.com.ifpr.victor;

public class Main 
{
	public static void main(String[] args) 
	{
		GeneralPreferences preferences = GeneralPreferences.getInstance();
		GeneralPreferences preferences2 = GeneralPreferences.getInstance();
		
		System.out.println("======================PREF 1======================");
		System.out.println("Pref 1 time-zone: " + preferences.getPreference("time-zone"));
		System.out.println("Pref 1 country: " + preferences.getPreference("country"));
		System.out.println("Pref 1 state: " + preferences.getPreference("state"));
		System.out.println("Pref 1 city: " + preferences.getPreference("city"));
		System.out.println("Pref 1 number: " + preferences.getPreference("number"));
		System.out.println("Pref 1 zip-code: " + preferences.getPreference("zip-code"));
		
		System.out.println("======================PREF 2======================");
		System.out.println("Pref 2 time-zone: " + preferences2.getPreference("time-zone"));
		System.out.println("Pref 2 country: " + preferences2.getPreference("country"));
		System.out.println("Pref 2 state: " + preferences2.getPreference("state"));
		System.out.println("Pref 2 city: " + preferences2.getPreference("city"));
		System.out.println("Pref 2 number: " + preferences2.getPreference("number"));
		System.out.println("Pref 2 zip-code: " + preferences2.getPreference("zip-code"));
	}
}
