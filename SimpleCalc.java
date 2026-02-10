package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalc {
    static void main(String[] args) {
        // Create the window
        JFrame window = new JFrame("Quick Calculator");
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        // Create the components
        JTextField num1Field = new JTextField(8);
        JTextField num2Field = new JTextField(8);
        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");
        JLabel resultLabel = new JLabel("Result: ");

        // Add action to buttons
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    resultLabel.setText("Sum: " + (num1 + num2));
                } catch (Exception ex) {
                    resultLabel.setText("Enter valid numbers!");
                }
            }
        });

        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    resultLabel.setText("Diff: " + (num1 - num2));
                } catch (Exception ex) {
                    resultLabel.setText("Enter valid numbers!");
                }
            }
        });

        // Add everything to window
        window.add(new JLabel("First:"));
        window.add(num1Field);
        window.add(new JLabel("Second:"));
        window.add(num2Field);
        window.add(addBtn);
        window.add(subBtn);
        window.add(resultLabel);

        // Show the window
        window.setVisible(true);
    }
}
