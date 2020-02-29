package com.pizzaExamples.Pizza;

import com.pizzaExamples.Cheese.Cheese;
import com.pizzaExamples.Clams.Clams;
import com.pizzaExamples.Dough.Dough;
import com.pizzaExamples.FrozenClams.FrozenClams;
import com.pizzaExamples.MarinaraSauce.MarinaraSauce;
import com.pizzaExamples.Pepperoni.Pepperoni;
import com.pizzaExamples.ReggianoCheese.ReggianoCheese;
import com.pizzaExamples.Sauce.Sauce;
import com.pizzaExamples.SlicedPepperoni.SlicedPepperoni;
import com.pizzaExamples.ThinCrustDough.ThinCrustDough;
import com.pizzaExamples.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

   /* @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return Veggies;
    }*/

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
