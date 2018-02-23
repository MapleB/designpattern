package decorate.original.model.beverage;

import decorate.original.model.beverage.base.Beverage;

/**
 * @author bifenglin
 * @date 2018/2/5 15:34
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 4.50;
    }
}
