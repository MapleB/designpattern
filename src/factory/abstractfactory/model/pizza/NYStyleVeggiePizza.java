package factory.abstractfactory.model.pizza;


import factory.abstractfactory.model.pizza.base.Pizza;
import factory.abstractfactory.model.pizzaingredient.base.PizzaIngredientFactory;

/**
 * @author bifenglin
 * @date 2018/2/6 17:09
 */
public class NYStyleVeggiePizza  extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing "+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
