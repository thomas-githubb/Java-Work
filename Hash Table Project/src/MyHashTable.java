import java.util.*;


public class MyHashTable {
	// ATTRIBUTES

		// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo
		// object holding a reference value pointing to an employee.

		public ArrayList<EmployeeInfo>[] buckets;

		
		// CONSTRUCTOR

		public MyHashTable(int howManyBuckets) {
			// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

			// Instantiate buckets as an array to have an ArrayList as each element of the array.
			buckets = new ArrayList[howManyBuckets];

			// For each element in the array, instantiate its ArrayList.
			for (int i = 0; i < howManyBuckets; i++) {
				buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
			}
		}


		// METHODS

		public int calcBucket(int employeeNumber) {
			return(employeeNumber % buckets.length);  // employee number modulo number of buckets
		}


		public void addToTable(EmployeeInfo theEmp) {
			// Add the employee referenced by theEmp to the hash table.
			
			if (theEmp != null) {
				int targetBucket = calcBucket(theEmp.empNumber);
				// Append that employee to the ArrayList for that bucket.
				boolean addStatus = buckets[targetBucket].add(theEmp);
			}
			
		}


		public EmployeeInfo removeFromTable(int empNumber) {
			// Remove that employee from the hash table and return the reference value for that employee.
			// Return null if that employee isn't in the table.
			int targetBucket = calcBucket(empNumber);
			for (int i = 0; i < buckets[targetBucket].size(); i++) {
				if (empNumber == buckets[targetBucket].get(i).empNumber) {
					EmployeeInfo removedNum = buckets[targetBucket].remove(i);
					return removedNum;
				}
			}
			return null;
		}

		
		public EmployeeInfo getFromTable(int empNumber) {
			// Return the reference value for that employee, return null if employee isn't in the table.
			int targetBucket = calcBucket(empNumber);
			for (int i = 0; i < buckets[targetBucket].size(); i++) {
				if (empNumber == buckets[targetBucket].get(i).empNumber) {
					EmployeeInfo getNum = buckets[targetBucket].get(i);
					return getNum;
				}
			}
			return null;
		}


		public void displayTable() {
			// Walk through the buckets and display the items in each bucket's ArrayList.
			EmployeeInfo currentEmp;
			for (int i = 0; i < buckets.length; i++) {
				System.out.print("\nContents for Bucket #" + i + "\n");
				// Display the items in this bucket's ArrayList.
				if (buckets[i].size() == 0) {
					System.out.println("     No items for this bucket!");
				}
				else {
					// Get the info for each item in this ArrayList.
					for (int j = 0; j < buckets[i].size(); j++) {
						currentEmp = buckets[i].get(j);
						System.out.println("     " + currentEmp.empNumber + " " + currentEmp.firstName + " " + currentEmp.lastName);
					}
				}
			}
		}
}