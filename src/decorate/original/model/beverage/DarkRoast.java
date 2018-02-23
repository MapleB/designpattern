package decorate.original.model.beverage;

import decorate.original.model.beverage.base.Beverage;

/**
 * @author bifenglin
 * @date 2018/2/5 15:22
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
