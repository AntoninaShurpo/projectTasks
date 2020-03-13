package com.hashMap;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<>();
        capitalCities.put("Belarus", "Minsk");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("Ukraine", "Kiev");
        System.out.println("Print all given countries and their capitals: " + capitalCities);

        System.out.println("Get capital of Belarus: " + capitalCities.get("Belarus"));
        System.out.println("Remove capital of USA: " + capitalCities.remove("USA"));
        System.out.println("Print size: " + capitalCities.size());

        System.out.println("\nKeys: ");

        for (String i : capitalCities.keySet()) {
            System.out.print(i + " ");
        }

        System.out.println("\nValues: ");
        for (String i : capitalCities.values()) {
            System.out.print(i + " ");
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("\nkey: " + i + " value " + capitalCities.get(i));
        }

        //capitalCities.clear();
        //System.out.println("Print any capital after clearance: " + capitalCities);

    }
}
