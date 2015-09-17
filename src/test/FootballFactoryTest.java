

import junit.framework.TestCase;
import org.junit.Test;

public class FootballFactoryTest {

    @Test
    public void footballFactoryGetAllItemsTest(){
        FootballFactory footballFactory = new FootballFactory("football.dat");
        TestCase.assertNotNull(footballFactory.all());
        TestCase.assertEquals(32, footballFactory.all().size());
        TestCase.assertEquals(
                new WeatherModel("   1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5\n"),
                footballFactory.all().get(1));
    }

}
