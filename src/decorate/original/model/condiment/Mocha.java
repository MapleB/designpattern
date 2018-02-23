package decorate.original.model.condiment;

import decorate.original.model.beverage.base.Beverage;
import decorate.original.model.condiment.base.CondimentDecorator;

/**
 * @author bifenglin
 * @date 2018/2/5 15:15
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
