import java.util.ArrayList;

public class DataMunging {

    private String fileName;

    public DataMunging(String fileName){
        this.fileName = fileName;
    }

    public String getLowerTemperatureDay() {

        WeathersFactory weathersApi = new WeathersFactory(fileName);
        ArrayList<WeatherModel> weatherModels = weathersApi.all();

        WeatherModel lowestTemperatureWeather = new WeatherModel(null);

        for(WeatherModel weatherModel:weatherModels){

            if(weatherModel.isTempIsLowerThen(lowestTemperatureWeather.minTemp))
            {
                lowestTemperatureWeather = weatherModel;
            }
        }

        return "day: "+ lowestTemperatureWeather.dayNumber +" temp: " + lowestTemperatureWeather.minTemp;
    }

}
