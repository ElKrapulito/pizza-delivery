package com.elkrapulito.pizzadelivery.interfaces;

public interface IBuilder {
    public PizzaBuilder addBorder(IBorder border);
    public PizzaBuilder addTopping(ITopping topping);
}
