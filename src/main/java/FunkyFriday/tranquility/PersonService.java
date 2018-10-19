package FunkyFriday.tranquility;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeopleList() {
        return convertRecordsToPeople();
    }

    private List<Person> convertRecordsToPeople() {
        List<Person> people = new ArrayList<>();
        List<String[]> records = personRepository.getAllRecordsFromFile();

        for (String[] record : records) {
            people.add(convertStringToPerson(record));
        }

        return people;
    }

    private Person convertStringToPerson(String[] record) {
        Person newPerson = new Person();

        newPerson.setId(Integer.valueOf(record[0]));
        newPerson.setName(record[1] + " " + record [2]);
        newPerson.setEmail(record[3]);
        if (record[4].length() > 0) {
            newPerson.setLastMassage(Instant.parse(record[4]));
        } else {
            newPerson.setLastMassage(Instant.EPOCH);
        }

        newPerson.setActive(Boolean.valueOf(record[5]));

        return newPerson;
    }

}
