public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashTable theHT = new MyHashTable(2);
		//MyHashTable anotherHT = new MyHashTable(50);
		
		FTE someFTE;
		PTE somePTE;
		EmployeeInfo removedEmp;
		
		someFTE = new FTE(123450, "Daffy", "Duck", 0.205, 60000.0);	
		System.out.println("The annual net income for Mr. Duck is" + " " + someFTE.calcAnnualNetIncome());
		theHT.addToTable(someFTE);
		
		someFTE = new FTE(987650, "Elmer", "Fudd", 0.26, 100000.0);	
		System.out.println("The annual net income for Mr. Fudd is" + " " + someFTE.calcAnnualNetIncome());
		theHT.addToTable(someFTE);
		
		someFTE = new FTE(222227, "Bugs", "Bunny", 0.15, 40000.0);	
		System.out.println("The annual net income for Mr. Bunny is" + " " + someFTE.calcAnnualNetIncome());
		theHT.addToTable(someFTE);
		
		somePTE = new PTE(111113, "Sylvester", "Jr.", 0.33, 300000.0, 1, 15);
		System.out.println("The annual net income for Mr. Jr. is" + " " + somePTE.calcAnnualNetIncome());
		theHT.displayTable();
		

		removedEmp = theHT.removeFromTable(987650);
		if (removedEmp == null) {
			System.out.println("\nThat employee is not in the table!");
		}
		else {
			System.out.println("\nRemoved employee " + removedEmp.empNumber
					+ " " + removedEmp.firstName);
			if (removedEmp instanceof FTE) {
				FTE removedFTE = (FTE) removedEmp; // Cast as an FTE
				System.out.println("Yearly salary is " + removedFTE.yearlySalary);
				System.out.println(removedFTE.empNumber);
		}
		
		theHT.displayTable();
		

		removedEmp = theHT.removeFromTable(898989);
		if (removedEmp == null) {
			System.out.println("\nThat employee is not in the table!");
		}
		else {
			System.out.println("\nRemoved employee " + removedEmp.empNumber
					+ " " + removedEmp.firstName
					+ " " + removedEmp.lastName);
		}
		
		theHT.displayTable();
		
		

		}

	}
}