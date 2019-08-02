package twothree;

public class FourNode implements Node{
	private int val1,val2,val3;
	private Node left, middle, right, parent;
	
	public FourNode(ThreeNode n, int val){
		val1 = n.getVal1();
		val2 = n.getVal2();
		val3 = val;
		left = n.getLeft();
		middle = n.getMiddle();
		right = n.getRight();
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

	public int getVal3() {
		return val3;
	}

	public void setVal3(int val3) {
		this.val3 = val3;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getMiddle() {
		return middle;
	}

	public void setMiddle(Node middle) {
		this.middle = middle;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	
}
