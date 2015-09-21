
public class WeatherModel implements DataModel{
    public String dayNumber;
    public Integer minTemp;

    public WeatherModel(String readLine) {
        if(readLine != null) {

            this.dayNumber = readLine.substring(0, 4).trim();
            try {
                this.minTemp = Integer.parseInt(readLine.substring(8, 14).trim());
            } catch (NumberFormatException e) {
                this.minTemp = null;
            }
        }
    }

    public boolean isTempIsLowerThen(Integer minTemp) {
        if(minTemp == null) return true;
        if(this.minTemp == null) return false;
        return this.minTemp < minTemp;
    }

    @Override
    public boolean equals(Object obj) {

        WeatherModel weatherModel = (WeatherModel) obj;

        if(weatherModel.minTemp.equals(this.minTemp) && weatherModel.dayNumber.equals(this.dayNumber)){
            return true;
        }

        return false;

    }
}
