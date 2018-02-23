package factory.abstractfactory.model.pizzaingredient.base;

import factory.abstractfactory.model.cheese.base.Cheese;
import factory.abstractfactory.model.dough.base.Dough;
import factory.abstractfactory.sauce.base.Sauce;

/**
 * @author bifenglin
 * @date 2018/2/8 11:33
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }
}
