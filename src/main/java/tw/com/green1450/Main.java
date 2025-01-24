package tw.com.green1450;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Frame extends JFrame {
    private final JLabel label;
    private final JButton button;
    private int num = 0;

    public Frame() {
        super("Hello Swing");
        super.setLayout(null);
        label = new JLabel("Enter your name:");
        label.setBounds(140, 50, 100, 30);
        add(label);   
        button = new JButton("click me!");
        button.setBounds(125, 200, 150, 25);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(Integer.toString(++num));
            }
        });
        add(button);
        
    }
}

public class Main extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.PINK);
        g.fillRect(0, 0, width, height);
    }


    public static void main(String[] args) {
        JFrame window = new Frame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        // window.setContentPane(new Main());


        window.setVisible(true);
    }
    
}
