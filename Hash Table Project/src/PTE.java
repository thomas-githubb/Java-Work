public class PTE extends EmployeeInfo {

	
	double hourlyWage;
	double hoursPerWeek;
	double weeksPerYear;
	
	public PTE (int eN, String fN, String lN, double dR, double hW, double hPW, double wPY) {
		super(eN, fN, lN, dR);
		hourlyWage = hW;
		hoursPerWeek = hPW;
		weeksPerYear = wPY;

	}
	
	public double calcAnnualGrossIncome() {
		return (hourlyWage*hoursPerWeek*weeksPerYear);
	}
	
	public double calcAnnualNetIncome() {
		return (hourlyWage*hoursPerWeek*weeksPerYear)*(1-deductionsRate);
	}
}
	
	
	