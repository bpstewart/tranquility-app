package FunkyFriday.tranquility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    String csvFile = "tranquility_data.csv";

    public List<String[]> getAllRecordsFromFile() {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<String[]> allRecords = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                allRecords.add(line.split(cvsSplitBy));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return allRecords;
    }

    public List<Person> getElegiblePeople() {
        return null;
    }

    public List<Person> getUnelegiblePeople() {
        return null;
    }

    public void addPersonToRepo(Person person) {
    }
}

