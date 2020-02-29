package com.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }


    public static ChocolateBoiler getUniqueInstance() {
        System.out.println("start");
        if (uniqueInstance == null) {
            System.out.println("uniqueInstance is null");
            uniqueInstance = new ChocolateBoiler();
            System.out.println("uniqueInstance was inited");
        }
        System.out.println("uniqueInstance is ready be returned");
        return uniqueInstance;
    }


    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //fill with milk and chocolate
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //drain boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //boil the stuff
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
