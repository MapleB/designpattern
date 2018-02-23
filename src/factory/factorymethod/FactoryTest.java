package factory.factorymethod;

import factory.factorymethod.model.NYPizzaStore;
import factory.factorymethod.model.base.Pizza;
import factory.factorymethod.model.base.PizzaStore;

/**
 * @author bifenglin
 * @date 2018/2/6 17:10
 */
public class FactoryTest {

    public static void main(String[] args) {
        //建立一个NYPizzaStore实例
        PizzaStore nyPizzaStore = new NYPizzaStore();
        //调用nyPizzaStore实例的orderPizza方法
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("order a "+pizza.getName());
    }

}
