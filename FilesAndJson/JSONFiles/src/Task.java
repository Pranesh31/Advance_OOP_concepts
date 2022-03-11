import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task {
    public static void main(String[] args){
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }

    public JsonObject readJson(String fileName){
            /* TODO: create a JSON object with the contents of  "filename".
               You can use the method below to help you read the file. */
            /* Put in the variable that should be returned. */
            JsonObject content = (JsonObject) Jsoner.deserialize(readFile(fileName),new JsonObject());
            return content;
    }

    public String readFile(String fileName){
        String content = "";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            int lengthRead = 0;
            while((lengthRead=br.read()) >= 0)
                content = content + (char)lengthRead;

        }catch(IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
        return content;
    }
}