package org.example;

import init.DataInitializer;
import manager.DataManager;
import model.Instructor;
import model.Person;
import model.Staff;
import model.Student;
import printer.ConsoleDataPriner;
import printer.DataPrinter;
import repository.ListRepository;
import repository.PersonRepository;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new ListRepository();
        DataPrinter<Person> dataPrinter = new ConsoleDataPriner();

        DataManager dataManager = new DataManager(personRepository, dataPrinter);
        DataInitializer initializer = new DataInitializer(dataManager);

        initializer.populate(1);

        dataManager.displayAllPerson();

        System.out.println("----");

        Person person = dataManager.findById(1001);
        System.out.println(person);
        if (person instanceof Instructor) {
            Instructor instructor = (Instructor) person;
            instructor.setSubject("Физика");
        } else if (person instanceof Staff) {
            Staff staff = (Staff) person;
            staff.setSalary(1_000_000);
        } else if (person instanceof Student) {
            Student student = (Student) person;
            student.setSchoolName("Университет");
        }
        System.out.println(person);

        System.out.println("----");

        dataManager.displayAllPerson();
    }
}
