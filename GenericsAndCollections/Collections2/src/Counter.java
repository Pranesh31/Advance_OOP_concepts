import java.util.HashMap;
import java.util.Set;

public class Counter<E> {
    private HashMap<E, Integer> counts;

    public Counter(E[] things){
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
            counts = new HashMap<>();
            int values;
            for(int i = 0; i < things.length; i++) {
                E eot = things[i];
                if (counts.containsKey(eot)) {
                    values = counts.get(eot) + 1;
                    counts.put(eot, values);
                }
                else
                    counts.put(eot,1);
        }
    }

    public Integer getCount(E element){
      /* TODO 
        This just returns the specific count for an element. It is a wrapper
        for a getting the value of the HashMap given the key "element" */
        return counts.get(element);
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent() {/* TODO
    Returns the most frequent key in the HashMap*/
        int max = 0;
        E frequent = null;
        Set<E> fElement = counts.keySet();
        for (E key : fElement) {
            int count = counts.get(key);
            if (count > max) {
                max = count;
                frequent = key;
            }
        }
        return frequent;
    }
}
