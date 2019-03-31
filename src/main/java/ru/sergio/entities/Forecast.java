package ru.sergio.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
	private List<Forecastday> forecastday = new ArrayList<>();
	
	

	public List<Forecastday> getForecastday() {
		return forecastday;
	}

	public void setForecastday(List<Forecastday> forecastday) {
		this.forecastday = forecastday;
	}

	
	@Override
	public String toString() {
		return "Forecast [forecastday=" + forecastday + "]";
	}
	
	
	
}
