import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ModifyGUI extends JFrame{
    public ModifyGUI(){
        ModifyGUIForm();
    }
    public void ModifyGUIForm(){
    	JPanel panel=new JPanel();
    	getContentPane().add(panel);
    	panel.setLayout(null);
    	setTitle("Modify Product");
    	setSize(300,200);
    	setLocationRelativeTo(null);
    	JLabel productlabel=new JLabel("Product Name:");
    	productlabel.setBounds(10,10,100,25);
    	panel.add(productlabel);
    	JTextField productname=new JTextField(30);
    	productname.setBounds(120,10,100,30);
    	panel.add(productname);
    	JLabel stocklabel=new JLabel("Stock:");
    	stocklabel.setBounds(10,50,100,25);
    	panel.add(stocklabel);
    	JTextField stockname=new JTextField(3);
    	stockname.setBounds(120,50,100,30);
    	panel.add(stockname);
    	JButton cancelButton=new JButton("Cancel");
        cancelButton.setBounds(180,120,80,30);
        cancelButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent event){
            setVisible(false);
            }
        }); 
    
        panel.add(cancelButton);
        JButton modifyButton=new JButton("Change");
        modifyButton.setBounds(80,120,80,30);
        panel.add(modifyButton);
        modifyButton.addActionListener(new ActionListener(){
        	
        	@Override
        	public void actionPerformed(ActionEvent event){
        		String product=productname.getText();
        		String stock=stockname.getText();
        		try{
                	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
                	String query1 = "UPDATE Storage SET stock=? WHERE product=?";
                	PreparedStatement pst = conn.prepareStatement(query1);
                	pst.setString(1, stock);
                	pst.setString(2, product);
                    pst.executeUpdate();
        		}catch(SQLException ex1){}
        	}
        });
    }
}
