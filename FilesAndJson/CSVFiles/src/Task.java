import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris-data.csv");
    }

    public Database readCSV(String filename) {
        String contents = "";
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename)); /* TODO.
Change what needs to go here to start reading "filename" */){
            byte[] buffer = new byte[1024];
            int lengthRead;
            /* TODO 
Create a while loop to read the contents of the file and put them in the variable "contents" declared at the beginning of the method. */

            while((lengthRead=in.read(buffer)) > 0){
                contents = contents + (char) lengthRead;

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return new Database(contents);
    }
}
