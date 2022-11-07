package FillRecords;

//The class that will be individually referenced by the RecordMaker Class.
public class RouteRecord {
    private String origin;
    private String airlineID;
    private String destination;
    private int[] passengers = {0,0,0,0,0,0};
    
    public void addToRecord ( int month, int passengers ) {
        this.passengers[month-1] += passengers;
    }

    public void makeRecord ( String from, String to, String ID ) {
        this.origin = to;
        this.destination = from;
        this.airlineID = ID;
    }
}