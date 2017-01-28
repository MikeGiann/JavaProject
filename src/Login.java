import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame{
    public Login(){
        LoginForm();
    }

    private void LoginForm() {
        JPanel panel=new JPanel(); 
        getContentPane().add(panel);
        panel.setLayout(null);
        setTitle("ElectronicStorage");
        setSize(300,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel user=new JLabel("Username:");
        user.setBounds(10,10,80,25);
        panel.add(user);
        JTextField userText=new JTextField(20);
        userText.setBounds(100,10,160,25);
        panel.add(userText);
        JLabel pass=new JLabel("Password:");
        pass.setBounds(10,40,80,25);
        panel.add(pass);
        JPasswordField passText=new JPasswordField(20);
        passText.setBounds(100,40,160,25);
        panel.add(passText);
        JButton loginButton=new JButton("Login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener(){
        
            @Override  
            public void actionPerformed(ActionEvent event){
                if("administrator".equals(userText.getText()) && "admin".equals(String.valueOf(passText.getPassword()))){
                    
                    GUI1 gui1=new GUI1();
                    gui1.setVisible(true);
                    setVisible(false);
                
                }
                else if("worker".equals(userText.getText()) && "worker".equals(String.valueOf(passText.getPassword()))){
                    
                    GUI2 gui2=new GUI2();
                    gui2.setVisible(true);
                    setVisible(false);
                }  
                else{  
                    JOptionPane.showMessageDialog(null,"Wrong username or password!");
                }
            }
        });
        JButton exitButton=new JButton("Exit");
        exitButton.setBounds(190,80,80,25);
        exitButton.addActionListener(new ActionListener(){
        
            @Override  
            public void actionPerformed(ActionEvent event){
            System.exit(0);
            }
        }); 
    
        panel.add(exitButton);
   }
}
