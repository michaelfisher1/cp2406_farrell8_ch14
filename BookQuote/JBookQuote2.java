/**
 * Created by jc225828 on 6/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel message1 = new JLabel("It was the best of times,");
    JLabel mesasge2 = new JLabel("It was the worst of times.");
    JButton button = new JButton("Click for Source");
    JLabel message3 = new JLabel("War and Peace");
    public JBookQuote2()
    {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(message1);
        add(mesasge2);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(message3);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(300,150);
        aFrame.setVisible(true);
    }
}
