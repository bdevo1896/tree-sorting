package twothree;

public class TwoNode implements Node{
	
	private int val;
	private Node parent,left,right;
	
	public TwoNode(int val){
		this.val = val;
		this.parent = null;
		this.left = null;
		this.right = null;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public int getValue1() {
		// TODO Auto-generated method stub
		return val;
	}

	@Override
	public int getValue2() {
		// TODO Auto-generated method stub
		return -9999999;
	}
	
	

}
