package hsiuying.Car;

import javax.swing.*;

public class Demo {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;
    private JPanel northPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new Demo().mainPanel);
        frame.setSize(700,350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

}
