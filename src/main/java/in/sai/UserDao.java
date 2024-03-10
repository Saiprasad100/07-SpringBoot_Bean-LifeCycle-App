package in.sai;

public class UserDao {
	
	public void init() {
		
		System.out.println("Getting DB Connection.....");
		
	}
	
	public void getData() {
		System.out.println("Getting Data from DB....");
	}
	public void destroy() {
		
		System.out.println("Closing DB Connection....");
		
	}

}
