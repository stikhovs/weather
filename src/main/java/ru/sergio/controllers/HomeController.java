package ru.sergio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import ru.sergio.entities.Weather;

@Controller
public class HomeController {

	@GetMapping("/")
	public String goHome(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		Weather weather = restTemplate.getForObject("https://api.apixu.com/v1/forecast.json?key=ac04a2fb55f643eba68131852192903&q=Moscow", Weather.class);
		System.out.println(weather);
		model.addAttribute("weather", weather);
		return "index";
	}
	
}
