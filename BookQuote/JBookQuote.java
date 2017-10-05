/**
 * Created by jc225828 on 6/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel message1 = new JLabel("It was the best of times,");
    JLabel mesasge2 = new JLabel("It was the worst of times.");
    public JBookQuote()
    {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(message1);
        add(mesasge2);
    }
    public static void main(String[] args)
    {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(300,150);
        aFrame.setVisible(true);
    }
}
