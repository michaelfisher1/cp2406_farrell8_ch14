/**
 * Created by jc225828 on 6/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Press to change the fact");
    JLabel asterix = new JLabel("*********************************************************");
    JLabel fact1 = new JLabel("The vikings are rumoured to be the first to visit North America");
    JLabel fact2 = new JLabel("Christopher Columbus was actually a pretty horrible dude!");
    JLabel fact3 = new JLabel("George Washington didnt really have wooden teeth, it was a mix of ivory and different animal teeth");
    JLabel fact4 = new JLabel("I cant really think of more facts, but a long string should work OK");
    JLabel fact5 = new JLabel("Tobacco was the number one crop grown in myself proceeding the Civil War, interesting hey?");
    int counter = 0;
    public JHistoricalFacts()
    {
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(asterix);
        add(fact1);
        button.addActionListener(this);
    }

    public static void main(String[] args)
    {
        JHistoricalFacts rFrame = new JHistoricalFacts();
        rFrame.setSize(400,200);
        rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(fact1);
            add(fact2);
        }
        else
            if(counter == 2)
            {
                remove(fact2);
                add(fact3);
            }
            else
                if(counter == 3)
                {
                    remove(fact3);
                    add(fact4);
                }
                else
                    if(counter == 4)
                    {
                        remove(fact4);
                        add(fact5);
                    }
                    else
                        {
                            remove(fact5);
                            add(fact1);
                        }
        validate();
        repaint();
    }
}

