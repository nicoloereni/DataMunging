
public class FootballDataMunging {

    public String getWorstGoalSDifferenceTeam() {


        FootballModel footballTeamWorstGoalsDifference = new FootballModel("");

        FootballFactory footballFactory = new FootballFactory("football.dat");

        for(FootballModel football: footballFactory.all())
        {
            if(football.getGoalsDifference() < footballTeamWorstGoalsDifference.getGoalsDifference())
            {
                footballTeamWorstGoalsDifference = football;
            }
        }

        return footballTeamWorstGoalsDifference.teamName;
    }
}
