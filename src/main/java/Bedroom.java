import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }



    public int countGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {

        this.guests.add(guest);
    }

    public String isRoomOccupied(){
        if(this.countGuests() > 0 ){
            return "true";
        }else{
            return "false";
        }
    }

    public void removeGuest() {
        this.guests.clear();
    }
}
