package FillRecords;
import java.util.*;
import java.io.*;

public class FindAirlineRoute {

    //Returns a string array of each line of the CSV File.
    public List<String> fileToStrings ( File file ) throws FileNotFoundException {
        int index = 0;
        String buffer;
        String split;
        
        Scanner fScanner = new Scanner (file);
        //Skips the First line of the file
        fScanner.nextLine();
        while (fScanner.hasNext()) {
            buffer = fScanner.nextLine();
            parsed.add(buffer.split(","));
            
            index++;
        }
        fScanner.close();
    }
}
