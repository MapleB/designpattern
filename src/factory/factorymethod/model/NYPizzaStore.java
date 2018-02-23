package factory.factorymethod.model;

import factory.factorymethod.model.base.Pizza;
import factory.factorymethod.model.base.PizzaStore;

/**
 * @author bifenglin
 * @date 2018/2/6 17:00
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("clam")){
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
