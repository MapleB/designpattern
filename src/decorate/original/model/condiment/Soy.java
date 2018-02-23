package decorate.original.model.condiment;

import decorate.original.model.beverage.base.Beverage;
import decorate.original.model.condiment.base.CondimentDecorator;

/**
 * @author bifenglin
 * @date 2018/2/5 15:33
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return 2.22 + beverage.cost();
    }
}
