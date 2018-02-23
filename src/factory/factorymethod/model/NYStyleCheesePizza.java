package factory.factorymethod.model;

import factory.factorymethod.model.base.Pizza;

/**
 * @author bifenglin
 * @date 2018/2/6 17:08
 */
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
