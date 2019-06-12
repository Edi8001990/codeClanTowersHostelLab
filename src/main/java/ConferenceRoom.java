import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public int countGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
