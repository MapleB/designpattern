package decorate.original.model.condiment;

import decorate.original.model.beverage.base.Beverage;
import decorate.original.model.condiment.base.CondimentDecorator;

/**
 * @author bifenglin
 * @date 2018/2/5 15:31
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        return 1.01 + beverage.cost();
    }
}
