package factory.abstractfactory.model.pizzastore.base;

import factory.abstractfactory.model.pizza.base.Pizza;

/**
 * @author bifenglin
 * @date 2018/2/6 12:19
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
