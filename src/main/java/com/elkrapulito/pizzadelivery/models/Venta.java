package com.elkrapulito.pizzadelivery.models;

import com.elkrapulito.pizzadelivery.interfaces.IDelivery;
import com.elkrapulito.pizzadelivery.interfaces.IPromotion;
import com.elkrapulito.pizzadelivery.interfaces.PizzaBuilder;

import java.util.List;

public class Venta {
    private String id;
    private IPromotion promotion;
    private IDelivery delivery;
    private List<PizzaBuilder> pizzaBuilderList;
}
