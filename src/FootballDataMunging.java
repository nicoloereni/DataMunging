public class FootballDataMunging extends DataMunging{

    public String getWorstGoalsDifferenceTeam() {

        DataFactory dataFactory = new DataFactory("football.dat") {
            @Override
            public DataModel createDataModelInstance(String line) {
                return new FootballModel(line);
            }
        };

        FootballModel footballTeamWorstGoalsDifference = (FootballModel) getDataModelSatisfiedCondition(dataFactory.all());
        return footballTeamWorstGoalsDifference.teamName;
    }
}
