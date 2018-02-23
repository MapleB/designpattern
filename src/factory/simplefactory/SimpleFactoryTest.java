package factory.simplefactory;

import factory.simplefactory.model.PizzaStore;
import factory.simplefactory.model.base.SimplePizzaFactory;

/**
 * @author bifenglin
 * @date 2018/2/6 13:17
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");



    }
}
