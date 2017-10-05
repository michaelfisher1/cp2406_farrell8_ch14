/**
 * Created by jc225828 on 6/10/17.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener
{
    final int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("Press the Button");
    int count = 0;
    final int MAX = 8;
    JLabel enough = new JLabel("That's Enough bro");
    public JFrameDisableButton2()
    {
        super("Frame");
        con.setLayout(new FlowLayout());
        setSize(SIZE,SIZE);
        con.add(button);
        con.add(enough);
        setVisible(true);
        enough.setVisible(false);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++count;
        if(count == MAX)
        {
            button.setEnabled(false);
            enough.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
    }
}
