package class26_Encapsulation_and_Collections;

public class DoctorEncapsulation {
	
	private long licenseID;
	private long phoneNumber;
	private String email;
	
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("gmail")) {
				this.email = email;
			}else {
				System.out.println("Email must be of gmail type");
			}
			
		}else {
			System.out.println("Email cannot b empty");
		}
	}

	public String getEmail() {
		return email;
		
	}
}
