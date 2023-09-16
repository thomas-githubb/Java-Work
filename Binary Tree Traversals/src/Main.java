
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyBinaryTree theTree = new MyBinaryTree(); // Instantiate an EMPTY tree
		StudentInfo someStudent;
		
		someStudent = new StudentInfo(10, "Daffy", "Duck");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(6, "Elmer", "Fudd");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(8, "Thomas", "Dermengea");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(13, "Lol", "Pop");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(18, "Pil", "Jeffery");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(7, "Dutton", "Jeff");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(3, "Carly", "Emily");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(4, "Carly", "Emily");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(11, "Carly", "Emily");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(29, "Carly", "Emily");
		theTree.insert(someStudent, theTree.root);
		
		someStudent = new StudentInfo(2, "Carly", "Emily");
		theTree.insert(someStudent, theTree.root);
		
		
		
		
		
		System.out.println("\nInorder traversal!");
		theTree.inorder(theTree.root);
		
		System.out.println("\nPreorder traversal!");
		theTree.preorder(theTree.root);
		
		System.out.println("\nPostorder traversal!");
		theTree.postorder(theTree.root);
	

	}

}
