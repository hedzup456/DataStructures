package trees;

import java.util.Random;

public class TreeTest {

	public static void main(String[] args) {
		Random rng = new Random();
		Tree tree = new Tree(rng.nextInt(), null);
		System.out.println("Generating");
		for (int o = 0; o < 10; o++) for (int i = 0; i < Short.MAX_VALUE; i++){
			tree.insert(rng.nextInt());
		}
		
		System.out.println("In order Traversal");
		inOrder(tree);
	}
	
	private static void postOrder(Tree t){
		if (t.hasLeftTree()) postOrder(t.leftNode);
		if (t.hasRightTree()) postOrder(t.rightNode);
		System.out.println(t.value);
	}
	private static void preOrder(Tree t){
		System.out.println(t.value);
		if (t.hasLeftTree()) postOrder(t.leftNode);
		if (t.hasRightTree()) postOrder(t.rightNode);
	}
	private static void inOrder(Tree t){
		if (t.hasLeftTree()) inOrder(t.leftNode);
		System.out.println(t.value);
		if (t.hasRightTree()) inOrder(t.rightNode);
	}
}
