package strategy;

import strategy.behavior.flybehavior.FlyRocketPowered;
import strategy.model.ModelDuck;
import strategy.model.base.Duck;
import strategy.model.MallardDuck;

/**
 * 策略模式
 * @author bifenglin
 * @date 2018/2/2 14:51
 */
public class StrategyTest {
    public static void main(String[] args) {
        //创建一个绿头鸭
        Duck mallard = new MallardDuck();
        //鸭子飞
        mallard.performFly();
        //鸭子叫
        mallard.performQuack();
/*
        //创建一个橡皮鸭
        Duck model = new ModelDuck();
        //给橡皮鸭加上火箭
        model.setFlyBehavior(new FlyRocketPowered());
        //鸭子飞
        model.performFly();
        //鸭子叫
        model.performQuack();*/
    }
}
