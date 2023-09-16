
public class MyStack {
	
	public StudentInfo top;
	public int numInStack;
	
	public MyStack() {
		
		top = null;
		numInStack = 0;
	}
	
	public void push(StudentInfo studentToAdd) {
		
		StudentInfo oldTop;
		oldTop = top;
		top = studentToAdd;
		top.next = oldTop;
		numInStack++;
		return;
	}
	
	public StudentInfo peek() {
		
		if (top == null ) {
			System.out.println("Nothing at the top of the stack");
		}
		
		StudentInfo someStudent = top;
		if (top != null);
			return someStudent;
	}
	
	public StudentInfo pop() {
		if (numInStack == 0) {
			return null;
		}
		StudentInfo removedTop = top;
		if (numInStack == 1) {
			removedTop.next = top;
			top.next = null;
			removedTop.next = removedTop;
			numInStack--;
			return removedTop.next;
		}
		StudentInfo previousTop;
		previousTop = top.next;
		removedTop.next = top;
		top.next = null;
		top = previousTop;
		numInStack--;
		return removedTop;
	}
	
	public void displayStack() {
		
		System.out.println("");
		
		if (top == null) {
			System.out.println("THE STACK IS EMPTY!");
			return;
		}
		
		// If we get to here, there is at least one item in the list.
		// Walk through the list from front to rear.
		System.out.println("The stack contents from top to bottom are:");
		StudentInfo currentStudent = top;
		for (int i = 1; i <= numInStack; i++) {
			System.out.println("  Full Name    :     " + currentStudent.firstName + " " + currentStudent.lastName);
			System.out.println("Student Number :     " + currentStudent.studentNumber);
			
			currentStudent = currentStudent.next;
		}
		return;
	}
	
}

