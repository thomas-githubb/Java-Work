

public class MyQueue {
	
	public StudentInfo front;
	public int numInQueue;
	
	
	public MyQueue() {
		// Make sure the list is empty
		front = null;
		numInQueue = 0;
	}
	
	public void enqueue(StudentInfo studentToAdd) {
		
		if (front == null) {
			// The list is empty!  So make the item the front of the list.
			studentToAdd.next = null; 
			front = studentToAdd;
			numInQueue = 1;
			return;
		}
		
		if (numInQueue == 1) {
			// List currently has only one item in it.
			front.next = studentToAdd;
			numInQueue = 2;
			return;
		}
		
		// If I get here, there are at least two items in the list already.
		// Walk down to the current last item in the list.
		StudentInfo currentItem = front;
		for (int i = 1; i < numInQueue; i++) {
			currentItem = currentItem.next;
		}
		currentItem.next = studentToAdd;
		numInQueue++;
		return;

	}
	
	public StudentInfo dequeue() {
		
		if (front == null){
			return null;
		}
		
		StudentInfo someStudent = front;
		front = front.next;
		someStudent.next = null;
		numInQueue --;
		return someStudent;
	}
	
	public void displayQueue() {
		
		System.out.println("");
		
		if (front == null) {
			System.out.println("THE QUEUE IS EMPTY!");
			return;
		}
		
		// If we get to here, there is at least one item in the list.
		// Walk through the list from front to rear.
		System.out.println("The queue contents from front to rear are:");
		StudentInfo currentStudent = front;
		for (int i = 1; i <= numInQueue; i++) {
			System.out.println("  Full Name    :     " + currentStudent.firstName + " " + currentStudent.lastName);
			System.out.println("Student Number :     " + currentStudent.studentNumber);
			
			currentStudent = currentStudent.next;
		}
		return;
		
	}

}
