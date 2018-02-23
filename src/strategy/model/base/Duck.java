package strategy.model.base;

import strategy.behavior.flybehavior.FlyBehavior;
import strategy.behavior.quackbehavior.QuackBehavior;

/**
 * 鸭子父类
 * @author bifenglin
 * @date 2018/2/2 14:42
 */
public abstract class Duck {
    //飞行行为
    protected FlyBehavior flyBehavior;
    //鸭子叫行为
    protected QuackBehavior quackBehavior;

    public Duck() {
    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, een decoys");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
