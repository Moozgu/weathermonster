package pl.lukaszgilga.weathermonster.model;

import lombok.Data;

import java.util.List;

@Data
public class ForecastModel {
    private List<WeatherModel> list;

}

