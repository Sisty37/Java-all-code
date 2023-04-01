

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class RegisterFrame extends JFrame {
    
    private Container c;
    private JLabel label,label2,label3,label4,label5,label6,label7,addressLabel;
    private JTextArea ta;
    private Font f;
    private JTextField tf2,tf3,tf4,tf5;
    private JPasswordField pf1,pf2;
    private JButton register, cancel,login;
    
    
    
    RegisterFrame()
    {
       initComponent();    
    }
    
    public void initComponent()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 50, 350, 500);
        this.setTitle("Register Form");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        f=new Font("Arial",Font.BOLD,12);
        
        
        label=new JLabel("Hello everyone Welcome to the Resister From.");
        label.setBounds(30, 5, 350, 30);
        c.add(label);
        
        
        label2=new JLabel("First Name:");
        label2.setBounds(30, 40, 150, 30);
        label2.setFont(f);
        label2.setForeground(Color.BLUE);
        c.add(label2);
        
        tf2=new JTextField();
        tf2.setBounds(100, 40, 150, 25);
        tf2.setFont(f);
        tf2.setForeground(Color.BLACK);
        tf2.setBackground(Color.WHITE);
        c.add(tf2);
        
        
        label3=new JLabel("Last Name:");
        label3.setBounds(30, 80, 150, 30);
        label3.setFont(f);
        label3.setForeground(Color.BLUE);
        c.add(label3);
        
         tf3=new JTextField();
        tf3.setBounds(100, 80, 150, 25);
        tf3.setFont(f);
        tf3.setForeground(Color.BLACK);
        tf3.setBackground(Color.WHITE);
         c.add(tf3);
        
        label4=new JLabel("Username:");
        label4.setBounds(30, 120, 150, 30);
        label4.setFont(f);
        label4.setForeground(Color.BLUE);
        c.add(label4);
        
         tf4=new JTextField();
        tf4.setBounds(100, 120, 150, 25);
        tf4.setFont(f);
        tf4.setForeground(Color.BLACK);
        tf4.setBackground(Color.WHITE);
         c.add(tf4);
        
        label5=new JLabel("Password:");
        label5.setBounds(30, 160, 150, 30);
        label5.setFont(f);
        label5.setForeground(Color.BLUE);
        c.add(label5);
        
        pf1=new JPasswordField();
        pf1.setBounds(100, 160, 150, 25);
        pf1.setFont(f);
        pf1.setForeground(Color.BLACK);
        pf1.setBackground(Color.WHITE);
        c.add(pf1);
        
        label6=new JLabel("Retype Pass:");
        label6.setBounds(30, 200, 150, 30);
        label6.setFont(f);
        label6.setForeground(Color.BLUE);
        c.add(label6);
        
        pf2=new JPasswordField();
        pf2.setBounds(110, 200, 140, 25);
        pf2.setFont(f);
        pf2.setForeground(Color.BLACK);
        pf2.setBackground(Color.WHITE);
        c.add(pf2);
        
        
        
        
        label7=new JLabel("Birth Date:");
        label7.setBounds(30, 240, 150, 30);
        label7.setFont(f);
        label7.setForeground(Color.BLUE);
        c.add(label7);
        
        tf5=new JTextField();
        tf5.setBounds(100, 240, 150, 25);
        tf5.setFont(f);
        tf5.setForeground(Color.BLACK);
        tf5.setBackground(Color.WHITE);
         c.add(tf5);
        
        addressLabel=new JLabel("Address:");
        addressLabel.setBounds(30, 280, 80, 50);
        addressLabel.setFont(f);
        addressLabel.setForeground(Color.BLUE);
        c.add(addressLabel);
        
        ta=new JTextArea();
        ta.setBounds(100, 280, 150, 80);
        ta.setFont(f);
        ta.setForeground(Color.BLACK);
        ta.setBackground(Color.WHITE);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(50, 380, 90, 25);
        cancel.setFont(f);
        cancel.setForeground(Color.RED);
        cancel.setBackground(Color.WHITE);
        c.add(cancel);
        
         
        register=new JButton("Register");
        register.setBounds(200, 380, 90, 25);
        //register.setFont(f);
        register.setForeground(Color.BLUE);
        register.setBackground(Color.WHITE);
        c.add(register);
        
        login=new JButton("Click here to Login");
        login.setBounds(80, 420, 180, 20);
        login.setFont(f);
        login.setForeground(Color.BLUE);
        login.setBackground(Color.WHITE);
        c.add(login);
        
    }
    
    
    
    public static void main(String[] args) {
        
        RegisterFrame frame=new RegisterFrame();
        frame.setVisible(true);
        
        
        
    }
    
}
