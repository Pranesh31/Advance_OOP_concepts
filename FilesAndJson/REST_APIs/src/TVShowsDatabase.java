import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TVShowsDatabase {

    String baseUrl = "http://api.tvmaze.com/search/";
/*
Create a method getURLSource that returns a String and gets a URL object as a parameter. It should also throw an exception.
This method should read the open stream of the url and concatenate it in a String. It should then return that String.
*/
public String getURLSource(URL url)  {
    String result = "";
    try{
        Scanner scanUrl = new Scanner(url.openStream());
        while(scanUrl.hasNext()){
            result += scanUrl.nextLine();
        }
        scanUrl.close();


    }catch (IOException e){
       e.printStackTrace();
    }
    return "{\"result\":"+result+"}";
    }
    public JsonObject getShowsByName(String name) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"shows?q="+name);

/* TODO 
You have to use the url to retrieve the contents of the website. 
This will be a String, but in JSON format. Use the auxiliary function you created above. */
            String content = getURLSource(url);
            JsonObject ob = (JsonObject) Jsoner.deserialize(content, new JsonObject());
            return ob; /* TODO
Remember to return a JSON object.*/
    }


    public JsonObject getPeopleInShows(String query) throws Exception
    {
        //Getting the things ready to connect to the web
        /* TODO 
Fill in this data type (Object) */

        URL url = new URL (baseUrl+"people?q="+query);

       /* TODO
Read the information coming from the web
 */
        String content = getURLSource(url);
        JsonObject ob = (JsonObject) Jsoner.deserialize(content, new JsonObject());
        return ob; /* TODO
return the appropriate result.
*/
    }


    public String formatShowAsString(JsonObject doc){
        String results = "";
        /* TODO 
This should return a String with each show in four fields:
Name:the name of the show
Link:the link to the show
rating average:The rating average of teh show, and 
summary, the summary of the show.*/
        JsonArray contents = (JsonArray) doc.get("result");
        for(Object i : contents){
            JsonObject ob = (JsonObject)((JsonObject)i).get("show") ;
            results += "Name:" +  (String)ob.get("name") + "\n" +
                        "Link:" +  (String)ob.get("url") + "\n" +
                       "Premiered:" +  (String)ob.get("premiered") + "\n";

            JsonObject rate = (JsonObject)ob.get("rating");
            BigDecimal avg = (BigDecimal)rate.get("average");

            results +=  "Rating Average:" + avg + "\n" +
                        "Summary:" +  (String)ob.get("summary") + "\n";
        }

        return results;
    }

    public void saveShows(String text, String outfile) {
        /* TODO
Given a String with some text in it, write that text to a file.
The name of the file is given in outfile */
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(outfile))){
            dos.writeBytes(text);
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
