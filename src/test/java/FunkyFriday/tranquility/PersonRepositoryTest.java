package FunkyFriday.tranquility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonRepositoryTest {

    @InjectMocks
    private PersonRepository repository;

    @Test
    public void whenGettingAllPeople_thenAllPeopleReturned(){
        repository.getAllRecordsFromFile();
    }
}
