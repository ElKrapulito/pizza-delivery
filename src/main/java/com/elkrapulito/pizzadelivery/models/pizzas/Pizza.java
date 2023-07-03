package com.elkrapulito.pizzadelivery.models.pizzas;

import com.elkrapulito.pizzadelivery.interfaces.IBorder;
import com.elkrapulito.pizzadelivery.interfaces.ITopping;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Pizza {
    private List<ITopping> toppings;
    private IBorder border;

    public Pizza() {
        this.toppings = new ArrayList<ITopping>();
    }

    public void addTopping(ITopping topping) {
        this.toppings.add(topping);
    }
}
