package ru.sergio.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Astro {
	 
	private String sunrise;
	private String sunset;
	private String moonrise;
	private String moonset;
	
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public String getMoonrise() {
		return moonrise;
	}
	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}
	public String getMoonset() {
		return moonset;
	}
	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}
	@Override
	public String toString() {
		return "Astro [sunrise=" + sunrise + ", sunset=" + sunset + ", moonrise=" + moonrise + ", moonset=" + moonset
				+ "]";
	}
	
	
}
