import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcApp extends JFrame {
    /*Setting Buttons*/
    String num1 = null;
    String num2 = null;

    CalcApp(){

        /*Setting Up Windows*/
        int WIDTH = 400;
        int HEIGHT = 500;
        this.setTitle("Calculator");
        this.setResizable(false);
        this.setSize(WIDTH, HEIGHT + 30);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        /*Setting Up Text Field*/
        JTextField numField = new JTextField();
        numField.setBounds(0,0,400, 100);
        numField.setFont(new Font("Arial", Font.PLAIN, 30));
        numField.setEditable(false);

        /*Setting Up Button */
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        JButton button0 = new JButton();
        JButton buttonsum = new JButton();
        JButton buttonsubs = new JButton();
        JButton buttondiv = new JButton();
        JButton buttonmult = new JButton();
        JButton buttoneq = new JButton();
        JButton buttondot = new JButton();

        /*Setting Up Button 3*/
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        button4.setText("4");
        button5.setText("5");
        button6.setText("6");
        button7.setText("7");
        button8.setText("8");
        button9.setText("9");
        button0.setText("0");
        buttonsum.setText("+");
        buttonsubs.setText("-");
        buttondiv.setText("/");
        buttonmult.setText("*");
        buttondot.setText(".");
        buttoneq.setText("C");


        /*Setting Up Panel (Just to make the process more clear*/
        Container contPanel = this.getContentPane();
        contPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        contPanel.setLayout(null);

        /*Setting up Components*/
        JPanel buttonPanel = new JPanel();
        buttonPanel.setSize(WIDTH, HEIGHT - 100);
        buttonPanel.setLayout(new GridLayout(4,4,2 , 2));
        buttonPanel.setBounds(0, 100, WIDTH, HEIGHT - 100);

        /*Add Buttons to buttonPanel*/
        /*Row 1*/
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonmult);
        /*Row 2*/
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttondiv);
        /*Row 3*/
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttondot);
        /*Row 4*/
        buttonPanel.add(button0);
        buttonPanel.add(buttonsum);
        buttonPanel.add(buttonsubs);
        buttonPanel.add(buttoneq);

        /*Combining All Panel*/
        contPanel.add(numField);
        contPanel.add(buttonPanel);

        /*Set Up Button Listener*/
        ActionListener buttonlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1){
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"1");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button2) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"2");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button3) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"3");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button4) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"4");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button5) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"5");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button6) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"6");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button7) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"7");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button8) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"8");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button9) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"9");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == button0) {
                    if (Num.getChangeNum()){
                        numField.setText("");
                        Num.setChangeNum(false);
                    };
                    numField.setText(numField.getText()+"0");
                    if (Num.isOperator()){
                        Num.setNum2(numField.getText());
                    }
                    else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                } else if (e.getSource() == buttondot) {
                    buttoneq.setText("=");
                    if (Num.getChangeNum()) {
                        numField.setText("");
                        Num.setChangeNum(false);
                    }
                    ;
                    numField.setText(numField.getText() + ".");
                    if (Num.isOperator()) {
                        Num.setNum2(numField.getText());
                    } else {
                        Num.setNum1(numField.getText());
                    }
                    System.out.println("Num1: " + Num.getNum1());
                    System.out.println("Num2: " + Num.getNum2());
                }
                else if (e.getSource() == buttonsum) {
                    buttoneq.setText("=");
                    if (!numField.getText().isEmpty()){
                        Num.setNum1(numField.getText());
                    }
                    Num.setOperator("+");
                    System.out.println(Num.getOperator());
                    Num.setChangeNum(true);
                } else if (e.getSource() == buttonsubs) {
                    buttoneq.setText("=");
                    if (!numField.getText().isEmpty()){
                        Num.setNum1(numField.getText());
                    }
                    Num.setOperator("-");
                    System.out.println(Num.getOperator());
                    Num.setChangeNum(true);
                }
                else if (e.getSource() == buttoneq) {
                    buttoneq.setText("C");
                    String result = "";
                    if (Num.isOperator()){
                        result = Num.calculateResult();
                        Num.setOperator(null);
                        Num.setNum1(null);
                        Num.setNum1(null);
                    }
                    numField.setText(result);
                } else if (e.getSource() == buttondiv) {
                    buttoneq.setText("=");
                    if (!numField.getText().isEmpty()){
                        Num.setNum1(numField.getText());
                    }
                    Num.setOperator("/");
                    System.out.println(Num.getOperator());
                    Num.setChangeNum(true);
                } else if (e.getSource() == buttonmult) {
                    buttoneq.setText("=");
                    if (!numField.getText().isEmpty()){
                        Num.setNum1(numField.getText());
                    }
                    Num.setOperator("*");
                    System.out.println(Num.getOperator());
                    Num.setChangeNum(true);
                }

            }

        };
        button1.addActionListener(buttonlistener);
        button2.addActionListener(buttonlistener);
        button3.addActionListener(buttonlistener);
        button4.addActionListener(buttonlistener);
        button5.addActionListener(buttonlistener);
        button6.addActionListener(buttonlistener);
        button7.addActionListener(buttonlistener);
        button8.addActionListener(buttonlistener);
        button9.addActionListener(buttonlistener);
        button0.addActionListener(buttonlistener);
        buttondot.addActionListener(buttonlistener);
        buttonsum.addActionListener(buttonlistener);
        buttonsubs.addActionListener(buttonlistener);
        buttondiv.addActionListener(buttonlistener);
        buttonmult.addActionListener(buttonlistener);
        buttoneq.addActionListener(buttonlistener);


    }

    public void exec_(){
        this.setVisible(true);
    }
}
