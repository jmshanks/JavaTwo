package javatwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;


public class Reader {


    public static List<Crime> readCrimeFromCSV(String fileName) throws IOException {

        List<Crime> crime = new ArrayList<>();

        Path pathToFile = Paths.get("D://crime2006.csv");


        try (BufferedReader br = Files.newBufferedReader(Paths.get("D://crime2006.csv"))) {

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

    public static List<NcicCode> readNcicFromTxt(String fileName) throws IOException {

        List<NcicCode> ncicCode = new ArrayList<>();
        Path pathToFile = Paths.get("D://ncic-codes.txt");


        try (BufferedReader br = Files.newBufferedReader(Paths.get("D://ncic-codes.txt"))) {

            String line = br.readLine();

            while (line != null) {
                String[] codeDesc = line.split("\t");
                NcicCode ncicCodes = listCode(codeDesc);

                ncicCode.add(ncicCodes);

                line = br.readLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

        return ncicCode;
    }

    private static NcicCode listCode(String[] ncicCode) {
        int code = Integer.parseInt(ncicCode[0]);
        String description = ncicCode[1];


        return new NcicCode(code, description);


    }

}
