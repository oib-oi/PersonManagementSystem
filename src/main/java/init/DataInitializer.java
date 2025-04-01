package init;

import manager.DataManager;
import model.*;

import java.util.Random;

public class DataInitializer {
    private DataManager dataManager;
    private Random random;

    public DataInitializer(DataManager dataManager) {
        this.dataManager = dataManager;
        this.random = new Random();
    }

    public void populate(int count) {
        int currentId = 1000;
//        Person staff = new Staff(currentId, "Имя 1", 20, 10000);
//        Person instructor = new Instructor(++currentId, "Имя 2", 20, "Информатика");
//        Person student = new Student(++currentId, "Имя 2", 15, "52");

        //dataManager.addPerson(staff, instructor, student);

        for (int i = 0; i < count; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    dataManager.addPerson(
                            new Student(
                                    ++currentId,
                                    "Имя " + i,
                            random.nextInt(7, 18),
                            "Школа № " + random.nextInt(100,1000)));
                    break;

                case 1:
                    dataManager.addPerson(
                            new Staff(
                                    ++currentId,
                                    "Имя " + i,
                                    random.nextInt(20, 65),
                                    random.nextInt(10,100) * 100));
                    break;

                default:
                    dataManager.addPerson(
                            new Instructor(
                                    ++currentId,
                                    "Имя " + i,
                                    random.nextInt(7, 18),
                                    "Предмет " + random.nextInt(100,1000)));
                    break;
            }
        }
    }
}
