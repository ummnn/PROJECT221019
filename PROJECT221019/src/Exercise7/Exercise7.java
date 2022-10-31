package Exercise7;

import javax.swing.*;
import java.awt.*;

public class Exercise7 extends JFrame {

    public Exercise7() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new North(), BorderLayout.NORTH);
        c.add(new Center(),BorderLayout.CENTER);
        c.add(new South(), BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise7();
    }
}
