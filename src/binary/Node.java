package binary;

public class Node implements Comparable<Node> {
	private int val;
	private Node left, right, parent;
	
	public Node(int val){
		this.val = val;
		this.left = null;
		this.right = null;
		this.parent = null;
	}

	public int getVal() {
		return val;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
	
	public Node getParent(){
		return parent;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public void setVal(int val) {
		this.val = val;
	}

	@Override
	public int compareTo(Node arg0) {
		if(arg0.getVal() > val){
			return -1;
		}else if(arg0.getVal() == val){
			return 0;
		}else{
			return 1;
		}
	}
	
	
}
