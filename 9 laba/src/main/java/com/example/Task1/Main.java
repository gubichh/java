package com.example.Task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Vehicle> vehicles = new HashMap<>();

        vehicles.put("Легковая", new Car("Легковая"));
        vehicles.put("Спортивный байк", new Bike("Спортивный байк"));
        vehicles.put("Городской автобус", new Bus("Городской автобус"));


        System.out.println("Список транспортных средств:");
        for (String key : vehicles.keySet()) {
            System.out.println("- " + key);
        }


        System.out.println("\nЗапуск транспорта:");
        for (Vehicle v : vehicles.values()) {
            v.start();
        }
    }
}
