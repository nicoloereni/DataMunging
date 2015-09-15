
import junit.framework.TestCase;
import org.junit.Test;

public class WeatherModelTest {

    @Test
    public void createWeatherModelTest(){

        WeatherModel weatherModel = new WeatherModel(
                "   1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5\n"
        );

        TestCase.assertEquals("1", weatherModel.dayNumber);
        TestCase.assertEquals(new Integer(59), weatherModel.minTemp);
    }

    @Test
    public void createWeatherWrongInputTest(){
        WeatherModel weatherModel = new WeatherModel(
                "   Dy MxT   MnT   AvT   HDDay  AvDP 1HrP TPcpn WxType PDir AvSp Dir MxS SkyC MxR MnR AvSLP"
        );

        TestCase.assertEquals("D", weatherModel.dayNumber);
        TestCase.assertEquals(null, weatherModel.minTemp);
    }
}
