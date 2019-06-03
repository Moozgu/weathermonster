package pl.lukaszgilga.weathermonster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.lukaszgilga.weathermonster.services.WeatherService;

@Controller
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/")
    public String index(){
        return "main";
    }

    @PostMapping("/")
    public String index(Model model,
                        @RequestParam("city") String city){
        model.addAttribute("weather",weatherService.getWeather(city));
        model.addAttribute("city",city);
        return "main";
    }

    @GetMapping("/forecast/")
    public String forecast(){
        return "forecast";
    }

    @PostMapping("/forecast/")
    public String forecast(Model model,
                           @RequestParam("city") String city) {
        model.addAttribute("forecast", weatherService.getForecast(city));
        model.addAttribute("city", city);
        return "forecast";
    }
}
