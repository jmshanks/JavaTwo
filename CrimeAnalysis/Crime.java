package javatwo;

import java.io.IOException;
import java.util.List;

import static javatwo.Reader.readCrimeFromCSV;

public class Crime {

    private String date;
    private String address;
    private int district;
    private String beat;
    private int grid;
    private String crimeDescription;
    private int ncicCode;
    private double latitude;
    private double longitude;

    public Crime(String date, String address, int district, String beat, int grid, String crimeDescription, int ncicCode, double latitude, double longitude) {
        this.date = date;
        this.address = address;
        this.district = district;
        this.beat = beat;
        this.grid = grid;
        this.crimeDescription = crimeDescription;
        this.ncicCode = ncicCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Address:  " + address + ", District: " + district + ", Beat: "
                + beat + ", Grid: " + grid + ", Description: " + crimeDescription + ", NCIC: " + ncicCode
                + ", Latitude: " + latitude + ", Longitude: " + longitude + "\n";
    }


    public static void showCrime() throws IOException {
        List<Crime> crime = readCrimeFromCSV("D://crime2006.csv");
        for (Crime c : crime) System.out.println(c);

    }



}
