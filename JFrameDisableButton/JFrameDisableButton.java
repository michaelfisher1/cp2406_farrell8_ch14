/**
 * Created by jc225828 on 6/10/17.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener
{
    final int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("Press the Button");
    public JFrameDisableButton()
    {
        super("Frame");
        con.setLayout(new FlowLayout());
        setSize(SIZE,SIZE);
        setVisible(true);
        con.add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        button.setEnabled(false);
    }
    public static void main(String[] args)
    {
        JFrameDisableButton frame = new JFrameDisableButton();
    }
}
