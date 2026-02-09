package Unit11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame1 {
    static void main(String[] args) {

        JFrame frame = new JFrame("Shishir Lama");

        JLabel messageLabel = new JLabel("Enter any number:");
        JTextField numberField = new JTextField("Enter number here");
        JButton checkResult = new JButton("check number");
        JLabel resultlabel = new JLabel("Result appears here!!!");

        checkResult.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //code here - input number is even or odd.
                String str = numberField.getText();
                try{
                    int num = Integer.parseInt(str);
                    if(num%2==0){
                        resultlabel.setText(num+" is even.");
                    }else{
                        resultlabel.setText(num+" is odd.");
                    }
                }catch (NumberFormatException e1){
                    resultlabel.setText("Invalid number. Please provide integer number.");
                }
            }
        });

        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(messageLabel);
        frame.add(numberField);
        frame.add(checkResult);
        frame.add(resultlabel);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
