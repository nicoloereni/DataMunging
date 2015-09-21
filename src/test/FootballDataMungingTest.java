import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FootballDataMungingTest {

    @Test
    public void getWorstGoalsDifference()
    {
        FootballDataMunging footballDataMunging = new FootballDataMunging();
        assertEquals("Leicester", footballDataMunging.getWorstGoalsDifferenceTeam());
    }

}
