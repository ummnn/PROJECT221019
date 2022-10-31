import javax.swing.*;
import java.awt.*;

public class Exercise3 extends JFrame {

    public Exercise3() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 10));

        for (int i = 0; i < 10; i++) {
            c.add(new JButton(Integer.toString(i)));
        }

        setSize(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise3();
    }
}