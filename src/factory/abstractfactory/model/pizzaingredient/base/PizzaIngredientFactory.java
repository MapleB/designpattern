package factory.abstractfactory.model.pizzaingredient.base;

import factory.abstractfactory.model.cheese.base.Cheese;
import factory.abstractfactory.model.dough.base.Dough;
import factory.abstractfactory.sauce.base.Sauce;

/**
 * @author bifenglin
 * @date 2018/2/8 11:28
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
