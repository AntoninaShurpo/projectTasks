package com.pizzaExamples.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();


        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");


        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");


        } else if (item.equals("claim")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Claim Pizza");


        }  return pizza;
    }
}
