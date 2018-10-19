package FunkyFriday.tranquility;

import java.time.Instant;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int id;
    private String name;
    private String email;
    private Instant lastMassage;
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getLastMassage() {
        return lastMassage;
    }

    public void setLastMassage(Instant lastMassage) {
        this.lastMassage = lastMassage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
