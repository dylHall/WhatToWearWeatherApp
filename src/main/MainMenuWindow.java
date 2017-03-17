package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Using this as a class for launching and stuff - can add the
 * GUI elements later, might just start it as command line and 
 * determine if going to be presented in HTML/CSS or not.
 * 
 * Have found OpenWeatherMap as an API for getting weather, but has
 * very limited options. Maybe start by INPUTTING the current weather
 * and giving recommendations.
 * 
 */
public class MainMenuWindow {

	public static void main(String[] args) {
		System.out.println("What to Wear app!");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("What is the current Temp? Enter here: ");
			String currentTemp = reader.readLine();
			System.out.print("Is it cloudy? y/n: ");
			String isCloudy = reader.readLine();
			System.out.print("Is it windy? y/n: ");
			String isWindy = reader.readLine();
			WeatherForm currentForm = new WeatherForm(currentTemp, isCloudy, isWindy);
			System.out.println(currentForm.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//need some kind of class/delegation to be able to suggest what to wear,
		//should probably have some kind of RNG element as well for a laugh.
		
		
		
		System.out.println("Exiting.");
	}

}
