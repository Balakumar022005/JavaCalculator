import java .awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main extends Frame {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, CLR, Plus, Minus, Multiple, Divide, Enter;
    TextField Display;

    Main() {
        Display = new TextField("0");
        Display.setBounds(100, 220, 190, 75);
        b1 = new Button("1");
        b1.setBounds(100, 300, 40, 40);
        b2 = new Button("2");
        b2.setBounds(150, 300, 40, 40);
        b3 = new Button("3");
        b3.setBounds(200, 300, 40, 40);
        b4 = new Button("4");
        b4.setBounds(100, 350, 40, 40);
        b5 = new Button("5");
        b5.setBounds(150, 350, 40, 40);
        b6 = new Button("6");
        b6.setBounds(200, 350, 40, 40);
        b7 = new Button("7");
        b7.setBounds(100, 400, 40, 40);
        b8 = new Button("8");
        b8.setBounds(150, 400, 40, 40);
        b9 = new Button("9");
        b9.setBounds(200, 400, 40, 40);
        b0 = new Button("0");
        b0.setBounds(150, 450, 40, 40);
        CLR = new Button("CLR");
        CLR.setBounds(200, 450, 40, 40);
        Plus = new Button("+");
        Plus.setBounds(250, 300, 40, 40);
        Minus = new Button("-");
        Minus.setBounds(250, 350, 40, 40);
        Multiple = new Button("*");
        Multiple.setBounds(250, 400, 40, 40);
        Divide = new Button("/");
        Divide.setBounds(250, 450, 40, 40);
        Enter = new Button("Enter");
        Enter.setBounds(100, 450, 40, 40);
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b0) {
                    String expression = Display.getText();
                    expression += "0";
                    Display.setText(expression);

                }

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    String expression = Display.getText();
                    expression += "1";
                    Display.setText(expression);

                }

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    String expression = Display.getText();
                    expression += "2";
                    Display.setText(expression);

                }

            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b3) {
                    String expression = Display.getText();
                    expression += "3";
                    Display.setText(expression);

                }

            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b4) {
                    String expression = Display.getText();
                    expression += "4";
                    Display.setText(expression);

                }

            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b5) {
                    String expression = Display.getText();
                    expression += "5";
                    Display.setText(expression);

                }

            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b6) {
                    String expression = Display.getText();
                    expression += "6";
                    Display.setText(expression);

                }

            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b7) {
                    String expression = Display.getText();
                    expression += "7";
                    Display.setText(expression);

                }

            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b8) {
                    String expression = Display.getText();
                    expression += "8";
                    Display.setText(expression);

                }

            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b9) {
                    String expression = Display.getText();
                    expression += "9";
                    Display.setText(expression);

                }

            }
        });
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Plus) {
                    String expression = Display.getText();
                    expression += "+";
                    Display.setText(expression);

                }

            }
        });
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Minus) {
                    String expression = Display.getText();
                    expression += "-";
                    Display.setText(expression);

                }

            }
        });
        Multiple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Multiple) {
                    String expression = Display.getText();
                    expression += "*";
                    Display.setText(expression);

                }

            }
        });
        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Divide) {
                    String expression = Display.getText();
                    expression += "/";
                    Display.setText(expression);

                }

            }
        });
        CLR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == CLR) {
                    Display.setText("0");
                }

            }
        });
        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Enter) {
                    int i, a, b, result = 0;
                    char op = '+';
                    String expression = Display.getText();
                    String temp = "", temp1 = "'";
                    for (i = 0; i < expression.length(); i++) {
                        if (Character.isDigit(expression.charAt(i))) {
                            temp += expression.charAt(i);
                        } else {
                            op = expression.charAt(i);
                            break;
                        }
                    }
                    temp1 = expression.substring(i + 1);
                    a = Integer.parseInt(temp);
                    b = Integer.parseInt(temp1);
                    switch (op) {
                        case '+': {
                            result = a + b;
                            break;
                        }
                        case '-': {
                            result = a - b;
                            break;
                        }
                        case '*': {
                            result = a * b;
                            break;
                        }
                        case '/': {
                            result = a / b;
                            break;
                        }
                    }
                    Display.setText(String.valueOf(result));
                }

            }
        });
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(CLR);
        add(Display);
        add(Plus);
        add(Minus);
        add(Multiple);
        add(Divide);
        add(Enter);
        setSize(100, 100);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Main();

    }
}