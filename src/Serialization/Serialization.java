package Serialization;

import java.io.File;
import java.io.Serializable;

public class Serialization implements Serializable {
    private static final long serialVersionUID = -693568801373526017L;

//    Если не хотим чтобы поле писалось в файл используем transient
//    private transient String name;

    private int id;
    private int age = 18;
    private String name;
    public static final File file = new File("src/Serialization/person.bin");

    public Serialization(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name + " : " + age;
    }
}
