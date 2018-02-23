package factory.abstractfactory.model.pizzaingredient;

import factory.abstractfactory.model.cheese.ReggianoCheese;
import factory.abstractfactory.model.cheese.base.Cheese;
import factory.abstractfactory.model.dough.ThinCrustDough;
import factory.abstractfactory.model.dough.base.Dough;
import factory.abstractfactory.model.pizzaingredient.base.PizzaIngredientFactory;
import factory.abstractfactory.sauce.MarianraSauce;
import factory.abstractfactory.sauce.base.Sauce;

/**
 * @author bifenglin
 * @date 2018/2/8 11:34
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        System.out.println("add NYPizza ThinCrustDough");
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("add NYPizza MarianraSauce");
        return new MarianraSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("add NYPizza ReggianoCheese");
        return new ReggianoCheese();
    }
}
