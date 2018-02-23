package strategy.model;

import strategy.behavior.flybehavior.FlyWithWings;
import strategy.behavior.quackbehavior.Quack;
import strategy.model.base.Duck;

/**
 * 绿头鸭继承鸭子父类
 * @author bifenglin
 * @date 2018/2/2 14:58
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //定义叫的行为：有叫声
        quackBehavior = new Quack();
        //定义飞的行为:能飞
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("i'm a real Mallard duck");
    }
}
