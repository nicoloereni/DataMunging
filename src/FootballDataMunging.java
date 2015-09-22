public class FootballDataMunging extends DataMunging{

    public FootballDataMunging(DataFactory dataFactory){
        this.dataFactory = dataFactory;
    }

    public String getWorstGoalsDifferenceTeam() {

        FootballModel footballTeamWorstGoalsDifference = (FootballModel) getDataModelSatisfiedCondition(dataFactory.all());
        return footballTeamWorstGoalsDifference.teamName;
    }
}
