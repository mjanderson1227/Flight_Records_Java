package FillRecords;
import java.util.*;
import java.io.*;

public class RecordMaker {
    public int size = 0;
    public ArrayList<RouteRecord> directory = new ArrayList<RouteRecord>();


    private RouteRecord makeRecord ( String[] line ) {
        int month = Integer.parseInt ( line[0] );
        int passengers = Integer.parseInt ( line[5] );
        RouteRecord newRecord = new RouteRecord();
        newRecord.makeRecord ( line[1], line[2], line[3] );
        newRecord.addToRecord ( month, passengers );
        return newRecord;
    }
    //Gets and returns an array to each value in the CSV file.
    private String[] getLine ( Scanner file ) {
        String buffer;
        String[] splitLine;
        buffer = file.nextLine();
        splitLine = buffer.split(",");
        return splitLine;
    }

    //Adds the route record to the overall route record array
    private void addToList ( RouteRecord record ) {
        this.directory.add(record);
        size++;
    }

    private int recordSearch ( RouteRecord r ) {
        if (route)
    }

    //Constructor
    public RecordMaker( File file ) throws FileNotFoundException {
        Scanner scanCSV = new Scanner ( file );
        //Skip the first line of the CSV file.
        scanCSV.nextLine();
        //Check scans in all the other lines and adds the data values to the overall arrayList
        while(scanCSV.hasNext()){
            String[] curLine = getLine( scanCSV );
            RouteRecord curRecord = makeRecord(curLine);
            addToList(curRecord);
        }
    }
}
