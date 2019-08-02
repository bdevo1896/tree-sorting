package binary;

public class BSTree {

	private Node root;

	public BSTree(){
		this.root = null;
	}

	public BSTree(int val){
		this.root = new Node(val);
	}

	public BSTree(Node n){
		this.root = n;
	}
	
	/**
	 * This method will
	 * @param n
	 * @param val
	 */
	public void insert(Node n,int val){
		if(n == null && root == null){
			root = new Node(val);
		}else if (n == null && root != null){
			n  = root;
			if(val < n.getVal()){
				if(n.getLeft()!=null){
					insert(n.getLeft(),val);
				}else{
					Node newNode = new Node(val);
					n.setLeft(newNode);
					newNode.setParent(n);
				}
			}else{
				if(n.getRight() != null){
					insert(n.getRight(),val);
				}else{
					Node newNode = new Node(val);
					n.setRight(newNode);
					newNode.setParent(n);
				}
			}
		}else{
			if(val < n.getVal()){
				if(n.getLeft()!=null){
					insert(n.getLeft(),val);
				}else{
					Node newNode = new Node(val);
					n.setLeft(newNode);
					newNode.setParent(n);
				}
			}else{
				if(n.getRight() != null){
					insert(n.getRight(),val);
				}else{
					Node newNode = new Node(val);
					n.setRight(newNode);
					newNode.setParent(n);
				}
			}
		}
	}

	public Node search(Node n,int val){
		if(n.getVal() == val){
			return n;
		}

		if(val < n.getVal()){
			if(n.getLeft() != null){
				return search(n.getLeft(),val);
			}else{
				return null;
			}
		}else{
			if(n.getRight() != null){
				return search(n.getRight(),val);
			}else{
				return null;
			}
		}
	}
	
	/**
	 * A wrapper method call for in-order
	 */
	public String printInOrder(){
		return printInOrder(root);
	}
	
	/**
	 * This will print the pre-order of nodes in the tree
	 */
	public String printInOrder(Node n){
		String rtnVal = "";
		if(n == null){
			return rtnVal;
		}
		
		rtnVal += ""+printInOrder(n.getLeft());
		
		rtnVal += ""+n.getVal();
		
		rtnVal += ""+printInOrder(n.getRight());
		
		return rtnVal;
		
	}
	
	public String printPostOrder(){
		return printPostOrder(root);
	}
	
	/**
	 * This will print the pre-order of nodes in the tree
	 */
	public String printPostOrder(Node n){
		String rtnVal = "";
		if(n == null){
			return rtnVal;
		}
		rtnVal += ""+printPostOrder(n.getLeft());
		rtnVal += ""+printPostOrder(n.getRight());
		rtnVal += ""+n.getVal();
		
		return rtnVal;
	}
	
	public String printPreOrder(){
		return printPreOrder(root);
	}
	
	/**
	 * This will print the pre-order of nodes in the tree
	 */
	public String printPreOrder(Node n){
		String rtnVal = "";
		if(n == null){
			return rtnVal;
		}
		
		rtnVal += ""+n.getVal();
		rtnVal += ""+printPreOrder(n.getLeft());
		rtnVal += ""+printPreOrder(n.getRight());
		
		return rtnVal;
	}
	
	/**
	 * This method will calculate the height of the tree
	 * @return
	 */
	public int getHeight(Node root){
		if(root == null)
			return 0;
		
		return (1+Math.max(getHeight(root.getLeft()), getHeight(root.getRight())));
	}
	
	public int getMax(){
		return getMax(root);
	}
	
	public int getMax(Node n){
		if(n == null){
			return 0;
		}
		
		if(n.getRight() != null){
			return getMax(n.getRight());
		}else{
			return n.getVal();
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}



}
