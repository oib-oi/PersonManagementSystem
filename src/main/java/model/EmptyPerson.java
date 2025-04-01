package model;

import java.util.Random;

public class EmptyPerson extends Person{
    public EmptyPerson() {
        super(-new Random().nextInt(), "empty", 0);
    }
}
