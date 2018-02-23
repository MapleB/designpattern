package factory.simplefactory.model;

import factory.simplefactory.model.base.Pizza;
import factory.simplefactory.model.base.SimplePizzaFactory;

/**
 * @author bifenglin
 * @date 2018/2/6 12:19
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
