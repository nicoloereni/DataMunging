
public class WeatherDataMunging extends DataMunging {

    private String fileName;

    public WeatherDataMunging(String fileName){
        this.fileName = fileName;
    }

    public String getLowerTemperatureDay() {

        DataFactory weathersFactory = new DataFactory(fileName) {
            @Override
            public DataModel createDataModelInstance(String line) {
                return new WeatherModel(line);
            }
        };

        WeatherModel lowestTemperatureWeather = (WeatherModel)getDataModelSatisfiedCondition(weathersFactory.all());
        return "day: "+ lowestTemperatureWeather.dayNumber +" temp: " + lowestTemperatureWeather.minTemp;
    }

}
