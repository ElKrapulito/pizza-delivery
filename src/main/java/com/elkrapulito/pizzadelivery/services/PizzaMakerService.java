package com.elkrapulito.pizzadelivery.services;

import com.elkrapulito.pizzadelivery.interfaces.PizzaBuilder;
import com.elkrapulito.pizzadelivery.models.borders.NoBorder;
import com.elkrapulito.pizzadelivery.models.pizzas.Pizza;
import com.elkrapulito.pizzadelivery.models.toppings.PeperonniTopping;
import com.elkrapulito.pizzadelivery.models.toppings.PineappleTopping;

public class PizzaMakerService {
    private PizzaBuilder pizzaBuilder;

    public PizzaMakerService() {
        this.pizzaBuilder = new PizzaBuilder();
    }

    public Pizza getHawaiianPizza() {
        this.pizzaBuilder.reset();
        return this.pizzaBuilder.addBorder(new NoBorder()).addTopping(new PineappleTopping()).getPizza();
    }

    public Pizza getPeperoniPizza() {
        this.pizzaBuilder.reset();
        return this.pizzaBuilder.addBorder(new NoBorder()).addTopping(new PeperonniTopping()).getPizza();
    }
}
