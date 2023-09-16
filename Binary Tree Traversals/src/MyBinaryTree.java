
public class MyBinaryTree {

	
	
	
	public StudentInfo root;
	public int numInTree;
	
	public MyBinaryTree() {
		root = null;
		numInTree = 0;
		
	}
	
	
	public void insert(StudentInfo studentToAdd, StudentInfo currentNode) {
		
		if (root == null) {
			
			root = studentToAdd;
			numInTree = 1;
			return;
			
		}
		
		// If we get here then there is at least 1 one node in the tree right now
		// currentNode should never be null at this point
		if (studentToAdd.studentNumber < currentNode.studentNumber) {
			if (currentNode.left == null) {
				
				currentNode.left = studentToAdd;
				numInTree ++;
			}
			else {
				insert(studentToAdd, currentNode.left);
				
			}
		}
		else {
			
			if (currentNode.right == null) {
				currentNode.right = studentToAdd;
				numInTree++;
				
			}
			else {
				insert(studentToAdd, currentNode.right);
				
				
			}
		}
	}
	
	public void inorder(StudentInfo currentNode) {
		if(currentNode.left == null) {
			System.out.print(currentNode.studentNumber + ", ");
			if(currentNode.right == null){
				return;
			}
			
			else {
				inorder(currentNode.right);
			}
		}
		else {
			inorder(currentNode.left);
			System.out.print(currentNode.studentNumber + ", ");
			if(currentNode.right == null){
				return;
			}
			
			else {
				inorder(currentNode.right);
				
			}
		}
	}

	public void preorder(StudentInfo currentNode) {
		System.out.print(currentNode.studentNumber + ", ");
		if(currentNode.left == null) {
			if(currentNode.right == null){
				return;
			}
					
			else {
				preorder(currentNode.right);
			}
		}
		else {
			preorder(currentNode.left);
			if(currentNode.right == null){
				return;
			}
					
			else {
				preorder(currentNode.right);
			}
		}
	}
		
	public void postorder(StudentInfo currentNode) {
		if(currentNode.left == null) {
			if(currentNode.right == null){
			}
				
			else {
				postorder(currentNode.right);
			}
		}
		else {
			postorder(currentNode.left);
			if(currentNode.right == null);
				
			else {
				postorder(currentNode.right);
			}
		}
		System.out.print(currentNode.studentNumber + ", ");
	}
}
				
	