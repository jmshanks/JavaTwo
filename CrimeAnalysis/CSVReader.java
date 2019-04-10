package javatwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;





public class CSVReader {


    public static List<Crime> readCrimeFromCSV(String fileName) throws IOException {

        List<Crime> crime = new ArrayList<>();
        Path pathToFile = Paths.get("C://crime2006.csv");


        try (BufferedReader br = Files.newBufferedReader(Paths.get("C://crime2006.csv"))) {

            String line = br.readLine();

            for (int i = 1; (line = br.readLine()) != null; i++)

                while (line != null) {
                    String[] incidents = line.split(",");
                    Crime crimes = listCrime(incidents);

                    crime.add(crimes);

                    line = br.readLine();
                }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return crime;
    }

    private static Crime listCrime(String[] crime) {
        String date = crime[0];
        String address = crime[1];
        int district = Integer.parseInt(crime[2]);
        String beat = crime[3];
        int grid = Integer.parseInt(crime[4]);
        String crimeDescription = crime[5];
        int ncicCode = Integer.parseInt(crime[6]);
        double latitude = Double.parseDouble(crime[7]);
        double longitude = Double.parseDouble(crime[8]);

        return new Crime(date, address, district, beat, grid, crimeDescription, ncicCode, latitude, longitude);

    }

}
