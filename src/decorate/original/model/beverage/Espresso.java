package decorate.original.model.beverage;

import decorate.original.model.beverage.base.Beverage;

/**
 * @author bifenglin
 * @date 2018/2/5 15:04
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
