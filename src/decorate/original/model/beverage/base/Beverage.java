package decorate.original.model.beverage.base;

/**
 * @author bifenglin
 * @date 2018/2/5 14:56
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
