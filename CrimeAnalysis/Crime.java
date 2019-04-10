package javatwo;

import java.io.IOException;
import java.util.List;

import static javatwo.CSVReader.readCrimeFromCSV;

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
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public String getCrimeDescription() {
        return crimeDescription;
    }

    public void setCrimeDescription(String crimeDescription) {
        this.crimeDescription = crimeDescription;
    }

    public int getNcicCode() {
        return ncicCode;
    }

    public void setNcicCode(int ncicCode) {
        this.ncicCode = ncicCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Address:  " + address + ", District: " + district + ", Beat: "
                + beat + ", Grid: " + grid + ", Description: " + crimeDescription + ", NCIC: " + ncicCode
                + ", Latitude: " + latitude + ", Longitude: " + longitude + "\n";
    }

    public static void showCrime() throws IOException {
        List<Crime> crime = readCrimeFromCSV("C://crime2006.csv");
        for (Crime c : crime) System.out.println(c);

    }

}
