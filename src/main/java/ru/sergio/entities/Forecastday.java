package ru.sergio.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecastday {
	private Day day;

	private Astro astro;
	
	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Astro getAstro() {
		return astro;
	}

	public void setAstro(Astro astro) {
		this.astro = astro;
	}
	
	@Override
	public String toString() {
		return "Forecastday [day=" + day + ", astro=" + astro + "]";
	}
	
	
	
}
