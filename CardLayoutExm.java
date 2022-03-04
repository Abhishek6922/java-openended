import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

/*<applet code="CardLayoutExm" width=300 height=400>
</applet>
*/
public class CardLayoutExm extends Applet implements ActionListener {
    JPanel cardPanel;
    JPanel onep, twop, threep, fourthp;
    JPanel buttonp;
    JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, equal;
    CardLayout ourLayout;

    public void init() {
        cardPanel = new JPanel();
        ourLayout = new CardLayout();
        cardPanel.setLayout(ourLayout);

        one = new JButton("1");
        one.addActionListener(this);
        two = new JButton("2");
        two.addActionListener(this);
        three = new JButton("3");
        three.addActionListener(this);
        four = new JButton("4");
        four.addActionListener(this);
        five = new JButton("5");
        five.addActionListener(this);
        six = new JButton("6");
        six.addActionListener(this);
        seven = new JButton("7");
        seven.addActionListener(this);
        eight = new JButton("8");
        eight.addActionListener(this);
        nine = new JButton("9");
        nine.addActionListener(this);
        zero = new JButton("0");
        zero.addActionListener(this);
        add = new JButton("+");
        add.addActionListener(this);
        sub = new JButton("-");
        sub.addActionListener(this);
        mul = new JButton("x");
        mul.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        equal = new JButton("=");
        equal.addActionListener(this);
        buttonp = new JPanel();
        JTextField textField = new JTextField();
        buttonp.setLayout(new GridLayout(3, 4, 10, 5));
        buttonp.add(one);
        buttonp.add(two);
        buttonp.add(three);
        buttonp.add(four);
        buttonp.add(five);
        buttonp.add(six);
        buttonp.add(seven);
        buttonp.add(eight);
        buttonp.add(nine);
        buttonp.add(zero);
        buttonp.add(add);
        buttonp.add(sub);
        buttonp.add(mul);
        buttonp.add(div);
        buttonp.add(equal);
        this.setLayout(new BorderLayout());
        this.add(buttonp, BorderLayout.SOUTH);
        // this.add(cardPanel,BorderLayout.CENTER);
        // cardPanel.add(fourthp,"Fourth");
        // cardPanel.add(onep,"one");
        // cardPanel.add(twop,"two");
        // cardPanel.add(threep,"three");
    }

    public void actionPerformed(ActionEvent e) {
        // if(e.getSource()==one)
        // ourLayout.show(cardPanel,"one");
        // if(e.getSource()==two)
        // ourLayout.show(cardPanel,"two");
        // if(e.getSource()==three)
        // ourLayout.show(cardPanel,"three");
    }
}
