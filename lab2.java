import java.util.Scanner; 
hi

public class lab2 {
	public static void main(String[] args) {
		String firstname, lastname; 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter first name: ");
		firstname = keyboard.next();
		System.out.print("Please enter last name: ");
		lastname = keyboard.next();
		
		String fullname = firstname + " " + lastname;
		fullname = fullname.toUpperCase();
		System.out.println(fullname);
		
		System.out.println("length = " + fullname.length());
		
		
		
		
		
		if (firstname.equals(lastname)) {
			System.out.println("the same");
		} else {
			System.out.println("NOT the same");
		}
		
		
		}
		
		
	}
  