package repository;

import model.EmptyPerson;
import model.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class ListRepository implements PersonRepository{

    private ArrayList<Person> storage;

    public ListRepository() {
        this.storage = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return storage.size();
    }

    @Override
    public void add(Person person) {
        storage.add(person);
    }

    @Override
    public void add(Person[] people) {
        storage.addAll(Arrays.asList(people));
    }

    @Override
    public Person findById(int id) {
        for (Person person : storage) {
            if (person.getId() == id) {
                return person;
            }
        }
        return new EmptyPerson();
    }

    @Override
    public ArrayList<Person> getAllPersons() {
        return storage;
    }
}
