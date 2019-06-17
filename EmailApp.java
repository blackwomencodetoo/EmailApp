import java.util.Scanner;

public class EmailApp {
  private String firstName;
  private String lastName;
  private String password;
  private String email;
  private int defaultPasswordLength = 10;
  private String department;
  private int mailboxCapacity = 500; //default mailbox capacity
  private String alternateEmail;
  private String company = "Napturalexpression.com";
  
	//Constructor to receive the first and last name 
  public EmailApp(String firstName, String lastName){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  System.out.println("Email being created for hire: " + this.firstName + " " + this.lastName);
	  
	  // Call a method asking for the department and return the department
	  
	  this.department = setDepartment();
	  System.out.println("Department for new hire: " + department);
	  
	  // Call a method that returns a random password
	  this.password = randomPassword(defaultPasswordLength);
	  System.out.println("Your temporary password is: " + this.password);
	  
	  // generate email
	  email = firstName.toLowerCase()+ lastName.toLowerCase() + "@" + department + "." + company;
	  System.out.println("Your email is: " + email);
  }
	  
  	  // Ask for the department
  
  		private String setDepartment() {
  		System.out.println("\n1 for Sales\n2 for Development\n3 for Accounting\n4 for HR\n0 for none");
  		
  		System.out.print("Enter the department this hire will be working in: ");
  		Scanner in = new Scanner(System.in);
  		int deptChoice = in.nextInt();
  		if (deptChoice == 1){return "Sales";}
  		else if (deptChoice == 2) {return "Development";}
  		else if (deptChoice == 3) {return "Accounting";}
  		else if (deptChoice == 4) {return "HR";}
  		else {return "";}
  		
  		}
  	//Generate a random password 
  		
  		private String randomPassword(int length) {
  			String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$&";
  			char[] password = new char[length];
  			for (int i=0; i<length; i++) {
  				int rand = (int)(Math.random() * passwordSet.length());
  				password[i] = passwordSet.charAt(rand);}
  			return new String (password);
  		}
  
  	//Set the mailbox capacity	
  		public void setMailboxCapacity(int capacity) {
  			this.mailboxCapacity = capacity;
  			
  		}
  
  	// Change password
  		public void setChangePassword(String password){
  			this.password = password;
  		}
  		
  	// Set the alternate password
  		public void setAlternateEmail(String altEmail){
  			this.alternateEmail = altEmail;
  		}
  
  	// Get methods
  		public int getMailCapacity() {return mailboxCapacity;}
  		public String getChangePassword() {return password;}
  		public String getAlternateEmail() {return alternateEmail;}
  		
  		
    // Show info
  		
  		public String showInfo() {
  			return "\nDisplay Name: " + firstName + " " + lastName +
  					"\nCompany Email: " + email +
  					"\nMailbox Capacity: " + mailboxCapacity + "mb";
  		}
}
