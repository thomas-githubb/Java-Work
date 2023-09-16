public class FTE extends EmployeeInfo {

	double yearlySalary;
	
	
	
	
	public FTE (int eN, String fN, String lN, double dR, double yS) {
		super (eN, fN, lN, dR);
		yearlySalary = yS;
		
		
	}
	
	public double calcAnnualGrossIncome() {
		return yearlySalary;
	}
	
	public double calcAnnualNetIncome() {
		return yearlySalary*(1-deductionsRate);
	}
	
	
	
	
}