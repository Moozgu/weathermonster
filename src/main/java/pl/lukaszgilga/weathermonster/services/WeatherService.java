package pl.lukaszgilga.weathermonster.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.lukaszgilga.weathermonster.model.ForecastModel;
import pl.lukaszgilga.weathermonster.model.WeatherModel;

@Service
public class WeatherService {

    public WeatherModel getWeather(String city){
        return getRestTemplate().getForObject("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=19e6d03a563846537da9f91303a5c09d&units=metric",WeatherModel.class);
    }
    public ForecastModel getForecast(String city){
        return getRestTemplate().getForObject("https://api.openweathermap.org/data/2.5/forecast?q="+city+"&appid=19e6d03a563846537da9f91303a5c09d&units=metric",ForecastModel.class);
    }



    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
