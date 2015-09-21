import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FootballFactory {
    private String fileName;

    public FootballFactory(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<FootballModel> all() {
        ArrayList<FootballModel> result = new ArrayList<FootballModel>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
            while (true) {
                String readLine = bufferedReader.readLine();

                if(readLine == null){
                    break;
                }

                if(readLine.length() == 0){
                    continue;
                }

                result.add(new FootballModel(readLine));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
