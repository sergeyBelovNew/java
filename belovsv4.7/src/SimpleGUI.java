import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleGUI {
    public void createMenu() {
            frame.setVisible(true);
            frame.setTitle("Калькулятор");
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 200, 800, 400);
            frame.setBackground(Color.CYAN);
            frame.setLayout(new GridBagLayout());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label1, label2;
            label1 = new JLabel();
            label2 = new JLabel();
            label1.setText("Число 1");
            label2.setText("Число 2");
            label1.setSize(100, 50);
            frame.add(label1);
            frame.add(label2);
            JButton buttonInput = new JButton("Ввод числа");
            buttonInput.setBackground(Color.GRAY);
            frame.add(buttonInput);
            ActionListener acc = new ActionListener();

            buttonInput.addActionListener(addActionListener){

        };

        }
        public void print (){
        JTextField output = new JTextField();
        frame.add(output);
        }
private  JFrame frame = new JFrame();

}