package Exercise8;

import javax.swing.*;
import java.awt.*;

public class Exercise8 extends JFrame {

    public Exercise8() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(),BorderLayout.CENTER);
        c.add(new SouthPanel(), BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise8();
    }
}
