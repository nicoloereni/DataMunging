import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WeathersFactory {

    private final String fileName;

    public WeathersFactory(String fileName){
        this.fileName = fileName;
    }

    public ArrayList<WeatherModel> all()
    {
        ArrayList<WeatherModel> result = new ArrayList<WeatherModel>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
            //perchè questa riga non la vogliamo

            while (true) {
                String readLine = bufferedReader.readLine();

                if(readLine == null){
                    break;
                }

                if(readLine.length() == 0){
                    continue;
                }

                result.add(new WeatherModel(readLine));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
