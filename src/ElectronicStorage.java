import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class ElectronicStorage{

    public static void main(String[] args) {
     
        SwingUtilities.invokeLater(new Runnable(){ //Ο‡Ο�Ξ·ΟƒΞΉΞΌΞΏΟ€ΞΏΞΉΞµΞ― Ο„Ξ· awt Ξ³ΞΉΞ± Ο„Ξ·Ξ½ ΞµΞΌΟ†Ξ¬Ξ½ΞΉΟƒΞ· Ο†Ο�Ο�ΞΌΞ±Ο‚ Ξ»Ο�Ξ³Ο‰ Ο�Ο„ΞΉ Ο„Ξ± ΟƒΟ„ΞΏΞΉΟ‡ΞµΞ―Ξ± Ο„Ξ·Ο‚ Ξ²ΞΉΞ²Ξ»ΞΉΞΏΞΈΞ®ΞΊΞ·Ο‚ swing Ξ΄ΞµΞ½ ΞµΞ―Ξ½Ξ±ΞΉ Ξ±ΟƒΟ†Ξ±Ξ»Ξ® Ξ³ΞΉΞ± Ο„Ξ·Ξ½ ΟƒΟ‰ΟƒΟ„Ξ® ΞΊΞ±Ο„Ξ±ΟƒΞΊΞµΟ…Ξ® Ο†Ο�Ο�ΞΌΞ±Ο‚ ΞΏΟ€Ο�Ο„Ξµ Ξ±Ο€ΞΏΟ†ΞµΟ�Ξ³ΞµΟ„Ξ±ΞΉ Ο„ΞΏ Ο�Ξ―ΟƒΞΊΞΏ Ξ½Ξ± ΞµΞΌΟ†Ξ±Ξ½ΞΉΟƒΟ„ΞµΞ― Ο€Ο�Ο�Ξ²Ξ»Ξ·ΞΌΞ± ΟƒΟ„ΞΏ Ο‡Ο„Ξ―ΟƒΞΉΞΌΞΏ Ο„Ξ·Ο‚
            @Override
            public void run(){
                Login log=new Login();
                log.setVisible(true);
                //GUI1 gui1=new GUI1();
                //gui1.setVisible(true);//ΞµΞΌΟ†Ξ¬Ξ½ΞΉΟƒΞ· Ο†Ο�Ο�ΞΌΞ±Ο‚
            }
        });
        
        MySQLConnection connsql = new MySQLConnection();// h sinarthsh poy evala ton 1o kwdika legetai SqlConn, gia afto thn xrishmopoiw se afthn thn entolh
        try 
        			{
        				String sql = "SELECT Storage FROM table";
        				PreparedStatement pre3 = null;
        				pre3 = connsql.getConnection().prepareStatement(sql);
        				ResultSet result3 = pre3.executeQuery();
        				while(result3.next())
        				{
        					System.out.println(result3.getString(1));
        				}
        }
        catch(Exception er)
        			{
        				System.out.println(er);
        			 
        			}
    }
}
