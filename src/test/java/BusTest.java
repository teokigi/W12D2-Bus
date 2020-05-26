import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop bus_stop;

    @Before
    public void before(){
        bus = new Bus("Hell",10);
        person = new Person();

        bus_stop = new BusStop();
        bus_stop.addPerson(person);
        bus_stop.addPerson(person);

    }

    @Test
    public void hasDestination(){
        assertEquals("Hell",bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10,bus.getCapacity());
    }

    @Test
    public void passengersStartEmpty(){
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void addPassenger(){
        bus.addPassenger(person);
        assertEquals(1,bus.passengerCount());
    }

    @Test
    public void addPassengerIfNotFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person); //10th passenger
        assertEquals(7,bus.passengerCount());
    }

    @Test
    public void cannotAddPassengerBecauseFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person); //11th passenger
        assertEquals(10,bus.passengerCount());
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1,bus.passengerCount());
    }

    @Test
    public void pickupPassengers(){
        Person shiftyPerson = bus_stop.removePerson();
        bus.addPassenger(shiftyPerson);
        assertEquals(1,bus.passengerCount());
        assertEquals(1,bus_stop.queueCount());
    }


}
