package strategy.behavior.quackbehavior;

/**
 * 叫行为:呱呱叫
 * @author bifenglin
 * @date 2018/2/2 14:49
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
