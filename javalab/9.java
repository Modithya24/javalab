import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExamUI extends JFrame implements ActionListener {

    JRadioButton r1;
    JLabel q;

    public ExamUI() {
        q = new JLabel("2 + 2 = ?");
        r1 = new JRadioButton("4");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);

        JButton next = new JButton("Next");
        next.addActionListener(this);

        setLayout(new GridLayout(4, 1));
        add(q);
        add(r1);
        add(next);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (!r1.isSelected()) {
            q.setText("Select an option!");
        } else {
            q.setText("Correct Answer!");
        }
    }

    public static void main(String[] args) {
        new ExamUI();
    }
}