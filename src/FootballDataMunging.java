
public class FootballDataMunging {

    public String getWorstGoalSDifferenceTeam() {

        FootballModel footballTeamWorstGoalsDifference = new FootballModel("");

        FootballFactory footballFactory = new FootballFactory("football.dat");

        for(FootballModel football: footballFactory.all())
        {
            Integer goalsDifference = football.getGoalsDifference();
            Integer worstGoalsDifference = footballTeamWorstGoalsDifference.getGoalsDifference();
            if(goalsDifference != null && (worstGoalsDifference == null || goalsDifference < worstGoalsDifference))
            {
                footballTeamWorstGoalsDifference = football;
            }
        }

        return footballTeamWorstGoalsDifference.teamName;
    }
}
