package factory.simplefactory.model.base;

import factory.simplefactory.model.ChinesesPizza;
import factory.simplefactory.model.ClamPizza;
import factory.simplefactory.model.VeggiePizza;
import factory.simplefactory.model.base.Pizza;

/**
 * @author bifenglin
 * @date 2018/2/6 12:12
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new ChinesesPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
