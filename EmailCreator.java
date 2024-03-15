import java.util.*;
import java.lang.Math;

public class EmailCreator {
	private String firstName;
	private String lastName; 
	private String department; 
	final private String companyName = "Linkfields";
	private String generatedPassword; 
	final int mailBoxCapacity = 100; 
	private String personalEmail; 
	private String workMail; 
	
	
	public EmailCreator()
	{
		this.firstName = " ";
		this.lastName = " ";
		this.department = " ";
		this.personalEmail = " ";
		
	}
	
	//get and set first name
	public String getFirstname()
	{
		return this.firstName; 
	}
	public void setFirstname(String firstName)
	{
		this.firstName = firstName; 
	}
	
	//get and set last name
	public String getLastname()
	{
		return this.lastName;
	}
	public void setLastname(String lastName)
	{
		this.lastName = lastName; 
	}
	
	//get and set department 
	public String getDepartment()
	{
		return this.department; 
	}
	public void setDepartment(String departmentName)
	{
		this.department = departmentName; 
	}
	
	//get and set personal email
	public String getPersonalEmail()
	{
		return this.personalEmail; 
	}
	public void setPersonalEmail(String personalEmail)
	{
		this.personalEmail = personalEmail; 
	}
	
	//get mailbox capacity 
	public int getMailBoXCapacity()
	{
		return this.mailBoxCapacity; 
	}
	
	//get companyName
	public String getCompanyName()
	{
		return this.companyName; 
	}
	
	public String getWorkMail()
	{
		workMail = getFirstname()+"."+getLastname()+"@"+getDepartment()+"."+
				getCompanyName()+".com";
		
		return workMail;
	}
	
	//get password 
	public String getPassword()
	{
		this.generatedPassword = passwordGenerator();
		return this.generatedPassword; 
	}
	//password generator 
	public String passwordGenerator()
	{
		int passwordLength= 10; 
		String generatedPassword = " ";
		String [] newPassword = new String[passwordLength];
		String [] charactersToUseInArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
				"W","X","Y","Z","0","1","2","3","4","5","6","7","8","9","!","@","#","$","%","/"};
		
		
		for(int i =0;i<passwordLength;i++)
		{
			int randomNumber = (int)(Math.random()*100);
			
			if(randomNumber > charactersToUseInArray.length)
			{
				while(randomNumber > charactersToUseInArray.length)
				{
					randomNumber /= 2; 
					Math.round(randomNumber);
				}
				
			} 
			
			newPassword[i] = charactersToUseInArray[randomNumber-1];
			generatedPassword = String.join("", newPassword);
		}
		
		
		return generatedPassword; 
	}
}
