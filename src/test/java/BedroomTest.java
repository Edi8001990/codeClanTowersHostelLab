import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before

    public void before(){
        guest = new Guest("John Smith");
        bedroom = new Bedroom(1, 2, "Double");
    }

    @Test
    public void checkIfRoomHasAguest(){
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void checkIfGuestIsAdded(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void checkIfGuestIsRoomFull(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(true, bedroom.isRoomOccupied());

    }

    @Test
    public void checkIfGuestIsRemovedFromRoom(){
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.countGuests());

    }




}
