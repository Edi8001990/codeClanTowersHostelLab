import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before

    public void before(){
        guest = new Guest("John Smith");
        conferenceRoom = new ConferenceRoom(10);
    }

    @Test
    public void checkIfConferenceRoomHasAguest(){
        assertEquals(0, conferenceRoom.countGuests());
    }

    @Test
    public void checkIfGuestIsAdded(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.countGuests());
    }


}


