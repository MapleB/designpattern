package decorate.original.model.condiment.base;

import decorate.original.model.beverage.base.Beverage;

/**
 * @author bifenglin
 * @date 2018/2/5 14:56
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract String getDescription();
}
