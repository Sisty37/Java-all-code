
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginDemo extends JFrame {
    private Container c;
    private JLabel userLabel,passLabel;
    private JPasswordField pf;
    private Font f;
    private JTextField tf;
    private JButton cancel,login,register;
    
    private JLabel imgLabel;
    private ImageIcon img1,img2;
    
     
    
    LoginDemo()
    {
        initComponent();
    }
    
    public void initComponent()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400,300);
        //frame.setLocation(200,50);
        this.setBounds(200, 50, 400, 300);
        this.setTitle("Login Form");
        this.setResizable(false);
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f=new Font("Arial",Font.ITALIC + Font.BOLD,14);

      
      //icon er jonno 
      img1 =new ImageIcon(getClass().getResource("icon.png"));
      this.setIconImage(img1.getImage());  
      
      //img2=new ImageIcon(getClass().getResource("icon.png"));
      // imgLabel=new JLabel(img2);
      //imgLabel.setBounds(50, 30, img2.getIconWidth(), img2.getIconHeight());
      //c.add(imgLabel);
       
        
        userLabel=new JLabel();
        userLabel.setText("User name:");
        userLabel.setBounds(50, 20, 150, 30);
        userLabel.setFont(f);
        userLabel.setForeground(Color.BLUE);
        //userLabel.setOpaque(true);
        //userLabel.setBackground(Color.BLACK);
        c.add(userLabel);
        
         tf=new JTextField();
        tf.setBounds(150, 20, 130, 30);
        tf.setFont(f);
        tf.setForeground(Color.YELLOW);
        tf.setBackground(Color.BLACK);
        c.add(tf);
        
        passLabel=new JLabel();
        passLabel.setText("Password:");
        passLabel.setBounds(50, 70, 150, 30);
        passLabel.setFont(f);
        passLabel.setForeground(Color.red);
        //passLabel.setOpaque(true);
       // passLabel.setBackground(Color.BLACK);
        c.add(passLabel);
        
         pf=new JPasswordField();
        pf.setBounds(150, 70, 130, 30);
        pf.setFont(f);
        pf.setForeground(Color.YELLOW);
        pf.setBackground(Color.GRAY);
        c.add(pf);
        
        
        //Button er jonno
        cancel=new JButton("Cancel");
        cancel.setBounds(60, 160, 90, 25);
        cancel.setFont(f);
        cancel.setForeground(Color.RED);
        cancel.setBackground(Color.WHITE);
        c.add(cancel);
        
        //user name and passwors clear korar jonno 
        cancel.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                tf.setText("");
                pf.setText("");
            }
            
        });
        
        
        login=new JButton("Login");
        login.setBounds(220, 160, 90, 25);
        login.setFont(f);
        login.setForeground(Color.BLUE);
        login.setBackground(Color.WHITE);
        c.add(login);
        
        login.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
               
                String userName=tf.getText();
                String password=pf.getText();
                
                if(userName.equals("Abu jafar sisty")&& password.equals("12345"))
                {
                    JOptionPane.showMessageDialog(null, "you are successfully login");
                    dispose();
                    RegisterFrame frame=new RegisterFrame();
                    frame.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
                }
            }
            
        });
        
        
        register=new JButton("Click here to create new account");
        register.setBounds(70, 200, 230, 20);
        //register.setFont(f);
        register.setForeground(Color.BLACK);
        register.setBackground(Color.WHITE);
        c.add(register);
        
    }
    
    public static void main(String[] args) {
        
        LoginDemo frame=new LoginDemo();
        frame.setVisible(true);
       
        
        
        
    }
    
}
