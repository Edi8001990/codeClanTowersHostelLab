import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();

    }


    public int countBedrooms() {
            return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }


    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkWhichRoomsAreEmpty(Guest guest) {
        for(Bedroom bedroom : this.bedrooms){
            System.out.println(this.bedrooms);

            if(bedroom.isRoomOccupied() == "false"){
             bedroom.addGuest(guest);
            }
            System.out.println("Room is full");

        }
    }

    public void checkOutGuest(Bedroom bedroom) {
         bedroom.removeGuest();

    }

}

