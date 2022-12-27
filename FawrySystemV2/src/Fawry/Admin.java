package Fawry;
import java.util.Scanner; 


public class Admin {

	private String name;
	private int Id;
	private String email;

	
	public Admin(String name, int Id, String email ) {
		this.name = name;
		this.Id = Id;
		this.email = email;
	}
	
	void updateRefund(Refund refund) {
		Scanner sc= new Scanner(System.in);    
		
		System.out.print("Would you like to confirm the refund of the service " + refund.getService()+" for the user with the num of "+ refund.getNum()+ " with the amount of "+ refund.getAmount());
		
		System.out.print(" Yes or No?");
		
		String ans= sc.nextLine();
		refund.refundConfirmation(ans);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setId(int Id) {
		this.Id = Id;
	}
	
	void setEmail(String email) {
		this.email = email;
	}
	
	String getName() {
		return name;
	}
	
	int getId() {
		return Id;
	}
	
	String getEmail() {
		return email;
	}
	public void createHandler(HandlerFactory hr) {
		hr.create_Form();
		System.out.print("Service has been handled Successfully");
	}
}