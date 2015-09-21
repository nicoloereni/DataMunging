import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class DataFactory {
    private String fileName;

    public DataFactory(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<DataModel> all() {
        ArrayList<DataModel> result = new ArrayList<DataModel>();

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

                result.add(createDataModelInstance(readLine));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public abstract DataModel createDataModelInstance(String line);
}
