import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import java.math.BigDecimal;

public class Database {
    /* TODO 
Declare a member variable that can 
be EASILY set from the constructor. */
        JsonObject res_data;

    public Database(JsonObject data){
        /* TODO 
set the memebr variable declared above.*/
        this.res_data = data;
    }

    public JsonObject getRestaurant(String name){
        /* TODO
        Complete this method as specified. */
        JsonArray res = (JsonArray) this.res_data.get("restaurants");
        int j = 0;
        for(int i=0; i < res.size(); i++){
           JsonObject ob = (JsonObject) res.get(i);
           if(ob.get("name").equals(name))
               j = i;
        }
        return (JsonObject) res.get(j);
    }

    public double getAvgReviews(String name){
        /* TODO 
Complete this method as specified.
 The previous method may be of help. 
*/
        JsonObject res_name = getRestaurant(name);
        JsonArray review = (JsonArray) res_name.get("reviews");
        double sum = 0;
        for(int i = 0; i < review.size(); i++){
            JsonObject ob = (JsonObject) review.get(i);
            BigDecimal rate = (BigDecimal)ob.get("rating");
            sum += rate.doubleValue();
        }
        return sum/review.size();
    }
}
