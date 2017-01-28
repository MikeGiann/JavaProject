import java.awt.event.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;

public class CreateGUI extends JFrame{
    public CreateGUI(){
        CreateGUIForm();
    }
    private void CreateGUIForm(){
    	JPanel panel=new JPanel();
    	getContentPane().add(panel);
    	panel.setLayout(null);
    	setTitle("Create New Product");
    	setSize(300,300);
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
    	JLabel barcodelabel=new JLabel("Barcode:");
    	barcodelabel.setBounds(10,90,100,25);
    	panel.add(barcodelabel);
    	JTextField barcodename=new JTextField(12);
    	barcodename.setBounds(120,90,100,30);
    	panel.add(barcodename);
    	JButton cancelButton=new JButton("Cancel");
        cancelButton.setBounds(180,200,80,30);
        cancelButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent event){
            setVisible(false);
            }
        }); 
    
        panel.add(cancelButton);
        JButton createButton=new JButton("Create");
        createButton.setBounds(25,200,80,30);
        panel.add(createButton);
        JButton generateButton=new JButton("Generate");
        generateButton.setBounds(25,150,100,30);
        panel.add(generateButton);
        generateButton.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent event){
        		Random rand=new Random();
        		StringBuilder sb = new StringBuilder();
        		for(int i=0;i<12;i++){
        			sb.append(rand.nextInt(9));
        		}
        		barcodename.setText(sb.toString());
        		
        	}
        });
        createButton.addActionListener(new ActionListener(){
        	
        	@Override
        	public void actionPerformed(ActionEvent event){
        		String product=productname.getText();
        		String stock=stockname.getText();
        		String barcode=barcodename.getText();
        		try{
                	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
                	String query1 = "INSERT INTO Storage(product,stock,barcode) VALUES(?,?,?)";
                	PreparedStatement pst = conn.prepareStatement(query1);
                	pst.setString(1, product);
                	pst.setString(2, stock);
                	pst.setString(3, barcode);
                    pst.executeUpdate();
        		}catch(SQLException ex1){}
        	}
        });
        
        	
        }
}
    
    

