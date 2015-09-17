

import junit.framework.TestCase;
import org.junit.Test;

public class WeathersFactoryTest {

    @Test
    public void weathersApiGetAllItemsTest(){
        WeathersFactory weathersApi = new WeathersFactory("weather.dat");
        TestCase.assertNotNull(weathersApi.all());
        TestCase.assertEquals(32, weathersApi.all().size());
        TestCase.assertEquals(
                new WeatherModel("   1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5\n"),
                weathersApi.all().get(1));
    }



}
