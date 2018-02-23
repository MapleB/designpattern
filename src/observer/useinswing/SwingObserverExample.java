package observer.useinswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author bifenglin
 * @date 2018/2/5 11:53
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("should i do it?");
        button.addActionListener(new AngeListListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

    class AngeListListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("don't do it,you may regret it!");
        }
    }

    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("come on,do it");
        }
    }

}
