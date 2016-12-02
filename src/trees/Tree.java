package trees;

public class Tree {
	public Tree leftNode, rightNode, parent;
	public int value;
	
	public Tree insert(int num){
		return insert(this, num);
	}
	public Tree insert(Tree t, int num) {
		  if (t == null) return t = new Tree(num, null);
		  
		  if (num <  t.value) t.leftNode = insert(t.leftNode, num);
		  else t.rightNode = insert(t.rightNode, num);
		  return t;
		 }
	
	
	public Tree(){
		this(0, null, null, null);
	}
	public Tree(int value, Tree parent) {
		this(value, null, null, parent);	// Call other contructor
	}
	public Tree(int value, Tree leftNode, Tree rightNode, Tree parent){
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.parent = parent;
	}
	public boolean hasLeftTree(){
		return leftNode != null;
	}
	public boolean hasRightTree(){
		return rightNode != null;
	}

	public boolean isRoot(){
		return parent.equals(null);
	}
}
