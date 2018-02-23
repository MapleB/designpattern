package decorate.original.model.beverage;

import decorate.original.model.beverage.base.Beverage;

/**
 * @author bifenglin
 * @date 2018/2/5 15:13
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Hose Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
