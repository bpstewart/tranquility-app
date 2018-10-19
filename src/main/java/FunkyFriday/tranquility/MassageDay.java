
package FunkyFriday.tranquility;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MassageDay{
    private int slotDuration;
    private List<Booking> bookings;
    private Instant startTime;
    private Instant endTime;

    public MassageDay(Instant startTime, Instant endTime, int slotDuration) {
        setStartTime(startTime);
        setEndTime(endTime);
        setSlotDuration(slotDuration);

    }

    public int getSlotDuration() {
        return slotDuration;
    }

    public void setSlotDuration(int slotDuration) {
        this.slotDuration = slotDuration;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public Instant getEndTime() {
        return endTime;
    }
}
