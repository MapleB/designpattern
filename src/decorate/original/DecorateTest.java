package decorate.original;

import decorate.original.model.beverage.DarkRoast;
import decorate.original.model.beverage.Espresso;
import decorate.original.model.beverage.HouseBlend;
import decorate.original.model.beverage.base.Beverage;
import decorate.original.model.condiment.Mocha;
import decorate.original.model.condiment.Soy;
import decorate.original.model.condiment.Whip;

/**
 * @author bifenglin
 * @date 2018/2/5 14:55
 */
public class DecorateTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());
    }
}
