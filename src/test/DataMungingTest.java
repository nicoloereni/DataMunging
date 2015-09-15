
import junit.framework.TestCase;
import org.junit.Test;

public class DataMungingTest {
    @Test
    public void dataMungingLowerTemperatureForDay()
    {
        DataMunging dataMunging = new DataMunging("weather.dat");
        TestCase.assertEquals("day: 9 temp: 32", dataMunging.getLowerTemperatureDay());
    }
}
