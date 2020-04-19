package class26_Encapsulation_and_Collections;

public class RegistractionClass {

	private String email;
	private String userName;
	private String password;
	
	
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		if(email.endsWith("@gmail.com")) {
			this.email = email;
		}else {
			System.out.println("only gmail.com is acceptable");
		}
	}
	public void setUserName(String userName ) {
		if(userName.isEmpty()&& userName.length()>6) {
			this.userName = userName;
		}else {
			System.out.println("Username cannot be empty");
		}
	}
	public void setPassword(String password) {
		if(password.contains(userName)) {
			this.password = password;
		}else {
			System.out.println("password connat contain username");
		}
	} 
	
	
}
