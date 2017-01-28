import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class GUI2 extends JFrame{
	public Object exitbutton;
	public Object logoutButton;
	public Object searchbutton;
	public Object modifyButton;
	public Object createButton;
	public Object statButton;
    public GUI2(){
        Form2();
    }
    private void Form2(){

        JPanel panel=new JPanel(); 
        getContentPane().add(panel);
        panel.setLayout(null);
        setTitle("ElectronicStorage-Worker");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton exitButton=new JButton("Exit");
        exitButton.setBounds(350,300,80,30);
        exitButton.addActionListener(new ActionListener(){
        
            @Override 
            public void actionPerformed(ActionEvent event){
            System.exit(0);
            }
        }); 
    
        panel.add(exitButton);
        JLabel welcome=new JLabel("WELCOME!");
        welcome.setBounds(210,20,100,20);
        panel.add(welcome);
        JButton searchButton=new JButton("Search");
        searchButton.setBounds(150,300,80,30);
        panel.add(searchButton);
        searchButton.addActionListener(new ActionListener(){
            
            @Override 
            public void actionPerformed(ActionEvent event){
            	
            	SearchGUI searchGUI=new SearchGUI();
            	searchGUI.setVisible(true);
        		setVisible(true);
            }
        });
        JLabel show=new JLabel("Choose Product:");
        show.setBounds(10,58,100,25);
        panel.add(show);
        JComboBox chooseBox=new JComboBox();
        chooseBox.setBounds(120,60,120,25);
        panel.add(chooseBox);
        try{
        	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            chooseBox.setEditable(false);
            chooseBox.addItem("");
            Statement stmt1=null;
            String query1 = "SELECT product FROM Storage";
            stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery(query1);
            while(rs1.next()) {
            	chooseBox.addItem(rs1.getString(1));
            }
        }catch (SQLException ex1){}
        JLabel stock=new JLabel("Product Stock:");
        stock.setBounds(10,88,120,25);
        panel.add(stock);
        JTextField stockText=new JTextField(5);
        stockText.setBounds(120,90,30,25);
        panel.add(stockText);
       // stockText.setEditable(false);
        JButton stockButton=new JButton("Stock");
        stockButton.setBounds(250,70,80,30);
        panel.add(stockButton);
        stockButton.addActionListener(new ActionListener(){
            
            @Override 
            public void actionPerformed(ActionEvent event){
            	String product = (String) chooseBox.getSelectedItem();
            	String query1 = "SELECT * FROM Storage WHERE product=?";
            	try{
                	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
                     
                     PreparedStatement pst = conn.prepareStatement(query1);
                     pst.setString(1,product);
                     ResultSet rs1 = pst.executeQuery();
                    while(rs1.next()){
                    	String show=rs1.getString("stock");
                    	stockText.setText(show);
                    }
            	}
            	catch(SQLException ex1){}
            }
        });
        JButton modifyButton=new JButton("Modify");
        modifyButton.setBounds(50,300,80,30);
        panel.add(modifyButton);
        modifyButton.addActionListener(new ActionListener(){
        	  @Override 
              public void actionPerformed(ActionEvent event){
        		  ModifyGUI modifyGUI=new ModifyGUI();
        		  modifyGUI.setVisible(true);
        		  setVisible(true);
        	  }
        });
        JButton logoutButton=new JButton("Log Out");
        logoutButton.setBounds(250,300,80,30);
        panel.add(logoutButton);
        logoutButton.addActionListener(new ActionListener(){
        
            @Override 
            public void actionPerformed(ActionEvent event){
                Login log=new Login();
                log.setVisible(true);
                setVisible(false);
            }
        }); 
    }
    
}