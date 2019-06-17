// Create email accounts for new hires
/* This application should generate an email address with the 
 * following syntax: firstname.lastname@department.company.com
 * The application should determine the department, generate a random string password
 * Have set methods to change password, set mailbox capacity, define alternate email address
 * Have get methods to display name, email and mailbox capacity.
 */

public class Email {

	public static void main(String[] args) {
		// create an instance of the email app class by calling the constructor
		
		EmailApp email = new EmailApp("Christelle", "Yemeck");
		System.out.println(email.showInfo());
		

	}

}
