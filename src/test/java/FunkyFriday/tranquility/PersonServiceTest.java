package FunkyFriday.tranquility;

import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Before
    public void init() {
        when(personRepository.getAllRecordsFromFile()).thenReturn(getAllRecordsFromFile());
    }

    @Test
    public void whenGettingAllPeople_thenAllPeopleReturned(){
        personService.getPeopleList();
    }

    private List<String[]> getAllRecordsFromFile() {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<String[]> allRecords = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("tranquility_data.csv"));
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
}
