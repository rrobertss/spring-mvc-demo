/*
 *  Company: RS
 *  Project: spring-mvc-demo
 *  Created: 9 lip 2021  10:24:32
 *  Author:  RS 		
 */
package pl.rsof.springdemo.mvc;

import java.util.LinkedHashMap;

/**
 * <p></p><p>9 lip 2021</p>
 * @author RS
 *
 */
public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	// do zaladowania panstw z klasy Javy 
//	private LinkedHashMap<String, String>countryOptions;
	private LinkedHashMap<String, String>favoriteLanguageOptions;
	private String[] operatingSystems;

	
	public Student() {
		// populate countries
	/*	countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("PL", "Poland");
		countryOptions.put("BR ", "Brasil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("PT", "Portugal");
		countryOptions.put("RU", "Russian");
		countryOptions.put("IT", "Italy");
		countryOptions.put("SK", "Slovakia");*/
		
		// populate programming language
		favoriteLanguageOptions = new LinkedHashMap<String, String>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("Javascript", "Javascript");
		favoriteLanguageOptions.put("Python", "Python");
		favoriteLanguageOptions.put("Scala", "Scala");
		
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
/*
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}	*/


	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
