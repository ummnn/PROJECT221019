package OpenChallenge;
//간단한 스윙 응용프로그램을 만들어보자. 그림과 같이 프레임의 컨텐트팬의 NORTH 영역에는 패널을 사용하여
//3개의 버튼을 가진 바를 만들고, 컨텐트팬의 CENTER에는 다음과 같이 3개의 문자열 "Hello", "Java", "Love"를 출력한다.

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame{
    OpenChallenge(){
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel(),BorderLayout.NORTH);
        c.add(new CenterPanel(),BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new OpenChallenge();
    }

}
class NorthPanel extends JPanel{
    NorthPanel(){
        setBackground(Color.LIGHT_GRAY);
        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}
class CenterPanel extends JPanel{
    CenterPanel(){
        this.setLayout(null);
        String text[] = {"Hello", "Java", "Love"};
        int x;
        int y;
        JLabel label;
        for(int i=0;i<3;i++) {
            x = (int)(Math.random()*250);
            y = (int)(Math.random()*250);
            label = new JLabel(text[i]);
            label.setLocation(x, y);
            label.setSize(50,10);
            this.add(label);
        }
    }
}