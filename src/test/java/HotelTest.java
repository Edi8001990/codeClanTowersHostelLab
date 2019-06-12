import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before

    public void before(){
        hotel = new Hotel();
        guest = new Guest("John Smith");
        bedroom1 = new Bedroom(1,2, "Double");
        bedroom2 = new Bedroom(2,1, "Single");
        bedroom3 = new Bedroom(3,2, "Double");
        bedroom4 = new Bedroom(4,1, "Single");
        bedroom5 = new Bedroom(5,2, "Double");
        conferenceRoom = new ConferenceRoom(10);

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);
        hotel.addBedroom(bedroom5);

    }


    @Test
    public void checkIfHotelHasNoRooms(){
        assertEquals(0, hotel.countBedrooms());
    }

    @Test
    public void checkIfHotelHasRooms() {

        assertEquals(5, hotel.countBedrooms());

    }


    @Test
    public void checkIfHotelHasNoConferenceRooms(){
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void checkIfHotelHasConfrenceRooms() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.countConferenceRooms());

    }

    @Test
    public void checkInGuest(){

        hotel.checkWhichRoomsAreEmpty(guest);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void checkOutGuest(){
        hotel.checkOutGuest(bedroom1);
        assertEquals(0, bedroom1.countGuests());
    }

    }
