import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FootballModelTest {

    @Test
    public void createFootballItem()
    {
        FootballModel footballModel = new FootballModel(
                "    1. Arsenal         38    26   9   3    79  -  36    87\n"
        );

        assertEquals(new Integer(79), footballModel.goalsDone);
        assertEquals(new Integer(36), footballModel.goalsGet);
        assertEquals(new Integer(43), footballModel.getGoalsDifference());
        assertEquals("Arsenal", footballModel.teamName);

    }

}
