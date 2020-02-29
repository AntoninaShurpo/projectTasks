package com.pizzaExamples.Pizza;

import com.pizzaExamples.Cheese.Cheese;
import com.pizzaExamples.Clams.Clams;
import com.pizzaExamples.Dough.Dough;
import com.pizzaExamples.Pepperoni.Pepperoni;
import com.pizzaExamples.Sauce.Sauce;
import com.pizzaExamples.Veggies.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    // ArrayList toppings = new ArrayList();

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 min at 350");

    }

    void cut() {
        System.out.println("Cutting pizza into diagonal pieces");

    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");

    }

    void setName(String name) {
        this.name = name;
    }

     String getName() {
        return name;
    }

   public String toString() {
        return name;
   }
}
