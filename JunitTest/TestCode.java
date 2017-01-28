import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.Test;


public class TestCode {

	@Test
	public void Test() {
		GUI1 tester1 = new GUI1();
		equals("Result");
		GUI1 tester2=new GUI1();
		equals(tester2.exitbutton);
		GUI1 tester3=new GUI1();
		equals(tester3.logoutButton);
		GUI1 tester4 = new GUI1();
		equals(tester4.createButton);
		GUI1 tester5=new GUI1();
		equals(tester5.searchbutton);
		GUI1 tester6=new GUI1();
		equals(tester6.modifyButton);
		GUI1 tester7=new GUI1();
		equals(tester7.statButton);
		GUI2 tester8 = new GUI2();
		equals("Result");
		GUI2 tester9=new GUI2();
		equals(tester9.exitbutton);
		GUI2 tester10=new GUI2();
		equals(tester10.logoutButton);
		GUI2 tester11=new GUI2();
		equals(tester11.searchbutton);
		GUI2 tester12=new GUI2();
		equals(tester12.modifyButton);
		CreateGUI tester13 = new CreateGUI();
		equals("Result");
		ModifyGUI tester14 = new ModifyGUI();
		equals("Result");
		StatGUI tester15 = new StatGUI();
		equals("Result");
		CreateGUI tester16 = new CreateGUI();
		equals("Result");
		SearchGUI tester17 = new SearchGUI();
		equals("Result");
		ElectronicStorage tester18 = new ElectronicStorage();
		equals("Result");
		MySQLConnection tester19 = new MySQLConnection();
		equals("Result");
		Login tester20 = new Login();
		equals("Result");
	}
}
