

import junit.framework.TestCase;
import org.junit.Test;

public class DataFactoryTest {

    @Test
    public void footballFactoryGetAllItemsTest(){
        DataFactory dataFactory = new DataFactory("football.dat") {
            @Override
            public DataModel createDataModelInstance(String line) {
                return new FootballModel(line);
            }
        };
        TestCase.assertNotNull(dataFactory.all());
        TestCase.assertEquals(22, dataFactory.all().size());
        TestCase.assertTrue(
                new FootballModel("    1. Arsenal         38    26   9   3    79  -  36    87\n")
                        .equals(dataFactory.all().get(1)));
    }

    @Test
    public void weathersApiGetAllItemsTest(){
        DataFactory weathersApi = new DataFactory("weather.dat") {
            @Override
            public DataModel createDataModelInstance(String line) {
                return new WeatherModel(line);
            }
        };
        TestCase.assertNotNull(weathersApi.all());
        TestCase.assertEquals(32, weathersApi.all().size());
        TestCase.assertEquals(
                new WeatherModel("   1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5\n"),
                weathersApi.all().get(1));
    }

}
