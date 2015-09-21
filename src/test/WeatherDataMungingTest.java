
import junit.framework.TestCase;
import org.junit.Test;

public class WeatherDataMungingTest {
    @Test
    public void dataMungingLowerTemperatureForDay()
    {
        WeatherDataMunging dataMunging = new WeatherDataMunging("weather.dat");
        TestCase.assertEquals("day: 9 temp: 32", dataMunging.getLowerTemperatureDay());
    }
}
