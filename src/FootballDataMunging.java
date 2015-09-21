
public class FootballDataMunging {

    public String getWorstGoalSDifferenceTeam() {

        FootballModel footballTeamWorstGoalsDifference = new FootballModel("");

        DataFactory dataFactory = new DataFactory("football.dat") {
            @Override
            public DataModel createInstance(String line) {
                return new FootballModel(line);
            }
        };

        for(DataModel dataModel: dataFactory.all())
        {
            FootballModel football = (FootballModel) dataModel;
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
