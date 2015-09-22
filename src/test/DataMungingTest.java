
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DataMungingTest {
    @Test
    public void dataMungingLowerTemperatureForDay()
    {
        WeatherDataMunging dataMunging = new WeatherDataMunging(new DataFactory("weather.dat") {
            @Override
            public DataModel createDataModelInstance(String line) {
                return new WeatherModel(line);
            }
        });
        TestCase.assertEquals("day: 9 temp: 32", dataMunging.getLowerTemperatureDay());
    }

    @Test
    public void getWorstGoalsDifference()
    {
        FootballDataMunging footballDataMunging = new FootballDataMunging(new DataFactory("football.dat") {
            @Override
            public DataModel createDataModelInstance(String line) {
                return new FootballModel(line);
            }
        });
        assertEquals("Leicester", footballDataMunging.getWorstGoalsDifferenceTeam());
    }
}
