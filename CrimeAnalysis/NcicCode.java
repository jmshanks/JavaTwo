package javatwo;


import java.io.IOException;
import java.util.List;

import static javatwo.Reader.readNcicFromTxt;

public class NcicCode {

    private int code;
    private String description;

    public NcicCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Ncic Code: " + code + ", Description:  " + description + "\n";
    }

    public static void showNcic() throws IOException {
        List<NcicCode> code = readNcicFromTxt("D://ncic-codes.txt");
        for (NcicCode n : code) System.out.println(n);

    }
}
