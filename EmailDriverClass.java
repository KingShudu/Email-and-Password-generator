import java.util.*;
import javax.swing.JOptionPane;

public class EmailDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String lastName; 
		String department; 
		String personalMail; 
		String usersPassword; 
		EmailCreator obj1 = new EmailCreator();
		
		firstName = JOptionPane.showInputDialog("Enter your first name:");
		obj1.setFirstname(firstName);
			
		lastName = JOptionPane.showInputDialog("Enter your last name:");
		obj1.setLastname(lastName);
		
		department = JOptionPane.showInputDialog("Enter your department:");
		obj1.setDepartment(department);
		
		personalMail = JOptionPane.showInputDialog("Enter your personal mail:");
		obj1.setPersonalEmail(personalMail);
		
		usersPassword = obj1.getPassword();
		
		JOptionPane.showMessageDialog(null, obj1.getWorkMail(), "Here is your new "+ obj1.getCompanyName()+" Email",  JOptionPane.INFORMATION_MESSAGE );
		
		JOptionPane.showMessageDialog(null, usersPassword,"Here is your secret password", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Name: \t"+obj1.getFirstname()+"\n"+
											"Surname: \t"+obj1.getLastname()+"\n"+
											"Email: \t"+obj1.getPersonalEmail()+"\n"+
											"Work mail: \t"+obj1.getWorkMail()+"\n"+
											"Password: \t"+"**************"+"\n"+
											"Mail Capacity: \t"+obj1.mailBoxCapacity
		,"Here are your full credentials", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
