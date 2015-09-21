

import junit.framework.TestCase;
import org.junit.Test;

public class FootballFactoryTest {

    @Test
    public void footballFactoryGetAllItemsTest(){
        DataFactory dataFactory = new DataFactory("football.dat") {
            @Override
            public DataModel createInstance(String line) {
                return new FootballModel(line);
            }
        };
        TestCase.assertNotNull(dataFactory.all());
        TestCase.assertEquals(22, dataFactory.all().size());
        TestCase.assertTrue(
                new FootballModel("    1. Arsenal         38    26   9   3    79  -  36    87\n")
                        .equals(dataFactory.all().get(1)));
    }

}
