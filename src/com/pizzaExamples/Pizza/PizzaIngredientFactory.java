package com.pizzaExamples.Pizza;

import com.pizzaExamples.Cheese.Cheese;
import com.pizzaExamples.Clams.Clams;
import com.pizzaExamples.Dough.Dough;
import com.pizzaExamples.Pepperoni.Pepperoni;
import com.pizzaExamples.Sauce.Sauce;
import com.pizzaExamples.Veggies.Veggies;

public abstract class PizzaIngredientFactory {
    public abstract Dough createDough();

    public abstract Sauce createSauce();

    public abstract Cheese createCheese();

    public abstract Veggies[] createVeggies();

    public abstract Pepperoni createPepperoni();

    public abstract Clams createClams();

}
