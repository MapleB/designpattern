package factory.abstractfactory.model.pizzastore;

import factory.abstractfactory.model.pizza.base.Pizza;
import factory.abstractfactory.model.pizzastore.base.PizzaStore;
import factory.abstractfactory.model.pizza.NYStyleCheesePizza;
import factory.abstractfactory.model.pizza.NYStyleClamPizza;
import factory.abstractfactory.model.pizza.NYStyleVeggiePizza;
import factory.abstractfactory.model.pizzaingredient.NYPizzaIngredientFactory;
import factory.abstractfactory.model.pizzaingredient.base.PizzaIngredientFactory;

/**
 * @author bifenglin
 * @date 2018/2/6 17:00
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("NY style cheese pizza");
        } else if (type.equals("clam")){
            pizza = new NYStyleClamPizza(pizzaIngredientFactory);
            pizza.setName("NY style clam pizza");
        } else if (type.equals("veggie")){
            pizza = new NYStyleVeggiePizza(pizzaIngredientFactory);
            pizza.setName("NY style veggie pizza");
        }
        return pizza;
    }
}
