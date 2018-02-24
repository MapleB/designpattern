package command.Model.base;

/**
 * @author bifenglin
 * @date 2018/2/23 16:29
 */
public interface Command {
    public void execute();
    public void undo();
}
