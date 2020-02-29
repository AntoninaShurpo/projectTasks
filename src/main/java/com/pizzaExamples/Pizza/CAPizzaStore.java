package com.pizzaExamples.Pizza;

public class CAPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();


        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("CA Style Cheese Pizza");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("CA Style Veggie Pizza");


        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("CA Style Pepperoni Pizza");


        } else if (item.equals("claim")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("CA Style Claim Pizza");


        }  return pizza;
    }
}
