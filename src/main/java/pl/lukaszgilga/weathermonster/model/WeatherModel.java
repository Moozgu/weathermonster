package pl.lukaszgilga.weathermonster.model;

import lombok.Data;

@Data
public class WeatherModel {

    private WeatherMain main;
//    private WeatherClouds clouds;


    @Data
    public static class WeatherMain{
        private double temp;
//        private int pressure;
//        private int humidity;



    }
//    @Data
//    public static class WeatherClouds{
//        private int all;
//    }

}
