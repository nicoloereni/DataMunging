import java.util.ArrayList;

public class WeatherDataMunging {

    private String fileName;

    public WeatherDataMunging(String fileName){
        this.fileName = fileName;
    }

    public String getLowerTemperatureDay() {

        DataFactory weathersFactory = new DataFactory(fileName) {
            @Override
            public DataModel createInstance(String line) {
                return new WeatherModel(line);
            }
        };
        ArrayList<DataModel> weatherModels = weathersFactory.all();

        WeatherModel lowestTemperatureWeather = new WeatherModel(null);

        for(DataModel datamodel:weatherModels){

            WeatherModel weatherModel = (WeatherModel) datamodel;

            if(weatherModel.isTempIsLowerThen(lowestTemperatureWeather.minTemp))
            {
                lowestTemperatureWeather = weatherModel;
            }
        }

        return "day: "+ lowestTemperatureWeather.dayNumber +" temp: " + lowestTemperatureWeather.minTemp;
    }

}
