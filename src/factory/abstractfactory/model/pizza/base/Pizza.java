package factory.abstractfactory.model.pizza.base;

import factory.abstractfactory.model.cheese.base.Cheese;
import factory.abstractfactory.model.dough.base.Dough;
import factory.abstractfactory.sauce.base.Sauce;

/**
 * @author bifenglin
 * @date 2018/2/6 12:12
 */
public abstract class Pizza {
    //名称
    protected String name;
    //面团类型
    protected Dough dough;
    //酱料类型
    protected Sauce sauce;

    protected Cheese cheese;

    public abstract void prepare();

    public void bake(){
        System.out.println("baking");
    };

    public void cut(){
        System.out.println("cutting");
    };

    public void box(){
        System.out.println("boxing");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
