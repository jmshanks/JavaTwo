package javatwo;

public class Crime {

    private int date;
    private String address;
    private int district;
    private int beat;
    private String grid;
    private String crimeDescription;
    private int ncicCode;
    private int latitude;
    private int longitude;

    public Crime(int date, String address, int district, int beat, String grid, String crimeDescription, int ncicCode, int latitude, int longitude) {
    }

    public int getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public int getDistrict() {
        return district;
    }

    public int getBeat() {
        return beat;
    }

    public String getGrid() {
        return grid;
    }

    public String getCrimeDescription() {
        return crimeDescription;
    }

    public int getNcicCode() {
        return ncicCode;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Address:  " + address + ", District: " + district + ", Beat: "
         + beat + ", Grid: " + grid + ", Description: " + crimeDescription + ", NCIC: " + ncicCode
         + ", Latitude: " + latitude + ", Longitude: " + longitude;
    }
}
