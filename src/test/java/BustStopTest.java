import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BustStopTest {

    BusStop bus_stop;
    Person person;

    @Before
    public void before(){
        bus_stop = new BusStop();
        person = new Person();
    }

    @Test
    public void appendPersonToQueue(){
        bus_stop.addPerson(person);
        assertEquals(1,bus_stop.queueCount());
    }

    @Test
    public void numberOfPersonsInQueue(){
        bus_stop.addPerson(person);
        bus_stop.addPerson(person);
        assertEquals(2,bus_stop.queueCount());

    }

    @Test
    public void removePersonFromQueue(){
        bus_stop.addPerson(person);
        bus_stop.addPerson(person);
        bus_stop.addPerson(person);
        bus_stop.removePerson();
        assertEquals(2,bus_stop.queueCount());
    }

}
