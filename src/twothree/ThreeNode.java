package twothree;

public class ThreeNode implements Node{
	
	private int val1;
	private int val2;
	private Node left;
	private Node right;
	private Node parent;
	private Node middle;
	
	public ThreeNode(int val1,int val2){
		this.val1 = val1;
		this.val1 = val2;
		this.left = null;
		this.right = null;
		this.parent = null;
		this.middle = null;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getMiddle() {
		return middle;
	}

	public void setMiddle(Node middle) {
		this.middle = middle;
	}

	@Override
	public int getValue1() {
		// TODO Auto-generated method stub
		return val1;
	}

	@Override
	public int getValue2() {
		// TODO Auto-generated method stub
		return val2;
	}

}
