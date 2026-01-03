import javax.swing.*;
import java.awt.*;

public class Myframe {
//r u serious ??
    public static void main(String[] args) {

        JFrame frame = new JFrame("From");
        frame.setSize(300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        JLabel l1 = new JLabel("Name:");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        frame.add(l1, gridBagConstraints);

        JTextField t1 = new JTextField(10);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        frame.add(t1, gridBagConstraints);

        JLabel l2 = new JLabel("Class");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        frame.add(l2, gridBagConstraints);

        JTextField t2 = new JTextField(10);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        frame.add(t2, gridBagConstraints);

        JLabel l3 = new JLabel("Roll no.");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        frame.add(l3, gridBagConstraints);

        JTextField t3 = new JTextField(10);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        frame.add(t3, gridBagConstraints);

        JLabel l4 = new JLabel("DOB");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        frame.add(l4, gridBagConstraints);

        JTextField t4 = new JTextField(10);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        frame.add(t4, gridBagConstraints);

        JButton btn = new JButton("Find Results");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        frame.add(btn, gridBagConstraints);

        JPanel j1 = new JPanel();

        j1.add(new JTextArea("English: 100"));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        frame.add(j1, gridBagConstraints);

        JPanel j2 = new JPanel();

        j2.add(new JTextArea("Nepali: 99"));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        frame.add(j2, gridBagConstraints);

        JPanel j3 = new JPanel();
        j3.add(new JTextArea("Maths: 99"));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        frame.add(j3, gridBagConstraints);

        frame.setVisible(true);

    }

}
