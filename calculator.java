import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class calculator
{
    public calculator()
    {
        JFrame jf = new JFrame("CALCULATOR");
        jf.setLayout(null);
		jf.setSize(600,600);
        jf.setLocation(300, 200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel displaylabel = new JLabel("Hello");
        displaylabel.setBounds(30, 50, 540, 40);
        displaylabel.setBackground(Color.GRAY);
        displaylabel.setOpaque(true);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displaylabel.setForeground(Color.white);

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(50, 130, 80, 80);
        jf.add(sevenButton);

        JButton eightButton = new JButton("8");
        eightButton.setBounds(150, 130, 80, 80);
        jf.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.setBounds(250, 130, 80, 80);
        jf.add(nineButton);

        JButton sixButton = new JButton("6");
        sixButton.setBounds(50, 230, 80, 80);
        jf.add(sixButton);

        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(150, 230, 80, 80);
        jf.add(fiveButton);

        JButton fourButton = new JButton("4");
        fourButton.setBounds(250, 230, 80, 80);
        jf.add(fourButton);

        JButton oneButton = new JButton("1");
        oneButton.setBounds(50, 330, 80, 80);
        jf.add(oneButton);

        jf.add(displaylabel); 
    }
    public static void main(String args[])
    {
        new calculator();
    }
}
