import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;

    public BusStop(){
        queue = new ArrayList<>();
    }

    public void addPerson(Person person){
        queue.add(person);
    }

    public Person removePerson(){
        return queue.remove(0);
    }

    public int queueCount(){
        return queue.size();
    }
}
