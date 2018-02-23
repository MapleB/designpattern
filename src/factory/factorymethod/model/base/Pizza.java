package factory.factorymethod.model.base;

import java.util.ArrayList;

/**
 * @author bifenglin
 * @date 2018/2/6 12:12
 */
public abstract class Pizza {
    //名称
    protected String name;
    //面团类型
    protected String dough;
    //酱料类型
    protected String sauce;
    //一套佐料
    protected ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("preparing"+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    "+toppings.get(i));
        }
    };

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
}
