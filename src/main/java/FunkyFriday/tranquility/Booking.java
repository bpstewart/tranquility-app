package FunkyFriday.tranquility;

import java.time.Instant;

public class Booking {
    private Instant StartTime;
    private String Location;
    private Person Person;


    public Instant getStartTime() {
        return StartTime;
    }

    public void setStartTime(Instant startTime) {
        StartTime = startTime;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Person getPerson() {
        return Person;
    }

    public void setPerson(Person person) {
        Person = person;
    }
}
