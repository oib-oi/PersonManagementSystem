package printer;

import model.Person;
import repository.PersonRepository;

import java.util.ArrayList;

public class ConsoleDataPriner implements DataPrinter<Person>{
    @Override
    public void displayAll(PersonRepository repository) {
        ArrayList<Person> all = repository.getAllPersons();
        for (Person person : all) {
                System.out.println(person.toString());
        }
    }
}
