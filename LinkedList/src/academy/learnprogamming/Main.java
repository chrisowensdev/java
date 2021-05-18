package academy.learnprogamming;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.addFirst("Toyota");
        cars.add(1, "Honda");
        cars.addLast("Lexus");

        System.out.println(cars);


    }
}
