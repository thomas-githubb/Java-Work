

public class StudentInfo {

	public int studentNumber;
	public String firstName;
	public String lastName;
	public StudentInfo next;
	
	public StudentInfo(int sNum, String firstName, String lastName) {
		this.studentNumber = sNum;
		this.firstName = firstName;
		this.lastName = lastName;
		next = null;
		
		
	}
}
