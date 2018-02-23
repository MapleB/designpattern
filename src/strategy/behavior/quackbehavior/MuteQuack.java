package strategy.behavior.quackbehavior;

/**
 * 叫行为:不能叫
 * @author bifenglin
 * @date 2018/2/2 14:49
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
