package javatwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Crime> readCrimeFromCSV(String fileName) throws FileNotFoundException {

        List<Crime> crime = new ArrayList<>();
        Path pathToFile = Paths.get("C://crime2006.csv");


        try (BufferedReader br = Files.newBufferedReader(Paths.get("C://crime2006.csv"),
                StandardCharsets.US_ASCII)) {

            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");
                Crime crimes = listCrime(attributes);

                crime.add(crimes);

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return crime;
    }

    private static Crime listCrime(String[] crime) {
        int date = Integer.parseInt(crime[0]);
        String address = crime[1];
        int district = Integer.parseInt(crime[2]);
        int beat = Integer.parseInt(crime[3]);
        String grid = crime[4];
        String crimeDescription = crime[5];
        int ncicCode = Integer.parseInt(crime[6]);
        int latitude = Integer.parseInt(crime[7]);
        int longitude = Integer.parseInt(crime[8]);

        return new Crime(date, address, district, beat, grid, crimeDescription, ncicCode, latitude, longitude);

    }

}

