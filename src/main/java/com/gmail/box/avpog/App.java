package com.gmail.box.avpog;

import com.gmail.box.avpog.utils.StudentNameComparator;
import com.gmail.box.avpog.utils.Car;
import com.gmail.box.avpog.utils.Student;
import java.util.*;

public class App {
    public static void main(String[] args) {

        // Cars

        Car car01 = new Car(2002, 110);
        Car car02 = new Car(1996, 180);
        Car car03 = new Car(2020, 221.5);
        Car car04 = new Car(2007, 111);
        Car car05 = new Car(1990, 90);

        List<Car> cars01 = new ArrayList<>(Arrays.asList(car01, car02, car03, car04, car05));

        //cars01.forEach(System.out::println);

        cars01.sort(Comparator.comparing(Car::getYearOfManufacture));

        cars01.forEach(System.out::println);

        Set<Car> cars02 = new TreeSet<>(Arrays.asList(car01, car02, car03, car04, car05));
        System.out.println();
        cars02.forEach(System.out::println);

        // Students

        Student student01 = new Student(18, "Andrii");
        Student student02 = new Student(21, "Oleksandr");
        Student student03 = new Student(24, "Mykola");
        Student student04 = new Student(21, "Nikita");
        Student student05 = new Student(16, "Daniil");

        List<Student> students01 = new ArrayList<>(Arrays.asList(student01, student02, student03, student04, student05));
        System.out.println();
        students01.forEach(System.out::println);
        students01.sort(null);
        System.out.println();
        students01.forEach(System.out::println);

        List<Student> students02 = new ArrayList<>(Arrays.asList(student01, student02, student03, student04, student05));
        System.out.println();
        students02.forEach(System.out::println);

        students02.sort(new StudentNameComparator());
        System.out.println();
        students02.forEach(System.out::println);
    }
}
