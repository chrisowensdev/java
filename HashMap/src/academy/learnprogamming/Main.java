package academy.learnprogamming;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities.get("England"));
    }
}
