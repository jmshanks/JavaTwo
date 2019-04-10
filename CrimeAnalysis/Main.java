package javatwo;


import java.io.FileNotFoundException;
import java.util.List;
import static javatwo.CSVReader.readCrimeFromCSV;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        List<Crime> crime = readCrimeFromCSV("crime2006.csv");

        for (Crime c : crime) {
            System.out.println(c);
        }
    }

}
