import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "D:/Dhanyaa/test.csv";
        String line = "";
        String cvsSplitBy = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("[Name= " + country[0] + " , Dept=" + country[1] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}