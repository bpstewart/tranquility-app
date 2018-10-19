package FunkyFriday.tranquility;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SlotAssigner {

    @Autowired
    private PersonRepository personRepository;


    public MassageDay assign(MassageDay massageDay) {
        return null;
    }

    public MassageDay reassignSlot(MassageDay massageDay, Person person, Instant slot) {
        return null;
    }

    public MassageDay cancelSlot(MassageDay massageDay, Instant slot) {
        return null;
    }
}
