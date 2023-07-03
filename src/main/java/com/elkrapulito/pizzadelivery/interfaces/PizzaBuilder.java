package com.elkrapulito.pizzadelivery.interfaces;

import com.elkrapulito.pizzadelivery.models.pizzas.Pizza;


public class PizzaBuilder implements IBuilder{
    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public PizzaBuilder addBorder(IBorder border) {
        pizza.setBorder(border);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(ITopping topping) {
        pizza.addTopping(topping);
        return this;
    }

    public Pizza getPizza() {
        return this.pizza;
    }

    public void reset() {
        this.pizza = new Pizza();
    }
}
