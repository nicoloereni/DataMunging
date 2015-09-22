
public class WeatherDataMunging extends DataMunging {


    public WeatherDataMunging(DataFactory dataFactory){
        this.dataFactory = dataFactory;
    }

    public String getLowerTemperatureDay() {

        WeatherModel lowestTemperatureWeather = (WeatherModel)getDataModelSatisfiedCondition(dataFactory.all());
        return "day: "+ lowestTemperatureWeather.dayNumber +" temp: " + lowestTemperatureWeather.minTemp;
    }

}
