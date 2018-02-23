package strategy.model;

import strategy.behavior.flybehavior.FlyNoWay;
import strategy.behavior.quackbehavior.Quack;
import strategy.model.base.Duck;

/**
 * 橡皮鸭继承鸭子父类
 * @author bifenglin
 * @date 2018/2/2 15:04
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        //定义飞的行为:不能飞
        flyBehavior = new FlyNoWay();
        //定义叫的行为:能叫
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm a model duck");
    }
}
