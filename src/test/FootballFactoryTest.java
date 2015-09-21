

import junit.framework.TestCase;
import org.junit.Test;

public class FootballFactoryTest {

    @Test
    public void footballFactoryGetAllItemsTest(){
        FootballFactory footballFactory = new FootballFactory("football.dat");
        TestCase.assertNotNull(footballFactory.all());
        TestCase.assertEquals(22, footballFactory.all().size());
        TestCase.assertTrue(
                new FootballModel("    1. Arsenal         38    26   9   3    79  -  36    87\n")
                        .equals( footballFactory.all().get(1)));
    }

}
