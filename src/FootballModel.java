
public class FootballModel {
    public Integer goalsDone = null;
    public Integer goalsGet = null;
    public String teamName = null;

    public FootballModel(String line) {
        if(line != null && !line.isEmpty()) {
            try {
                goalsDone = Integer.parseInt(line.substring(43, 45).trim());
                goalsGet = Integer.parseInt(line.substring(48, 53).trim());
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }

            teamName = line.substring(7, 20).trim();

        }
    }

    public Integer getGoalsDifference() {

        if(goalsDone == null || goalsGet == null)
            return null;
        return goalsDone - goalsGet;
    }

    @Override
    public boolean equals(Object obj) {

        FootballModel footballModel = (FootballModel) obj;
        if(this.goalsDone == footballModel.goalsDone && this.goalsGet == footballModel.goalsGet && this.teamName.equals(footballModel.teamName)) {
            return true;
        }

        return false;

    }
}
