
public class FootballModel {
    public Integer goalsDone;
    public Integer goalsGet;
    public String teamName;

    public FootballModel(String line) {
        goalsDone = Integer.parseInt(line.substring(43, 45).trim());
        goalsGet = Integer.parseInt(line.substring(48, 53).trim());
        teamName = line.substring(7, 20).trim();
        System.out.println(teamName);
    }

    public Integer getGoalsDifference() {
        return goalsDone - goalsGet;
    }
}
