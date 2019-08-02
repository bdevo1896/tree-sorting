package twothree;

public class TTTree {
	
	private Node root;
	
	public TTTree(){
		root = null;
	}
	
	public Node search(Node n, int val){
		if(n instanceof TwoNode){
			return search2(n,val);
		}else{
			return search3(n,val);
		}
	}
	
	public Node search2(Node n, int val){
		TwoNode n2 = (TwoNode) n;
		if(n2.getVal() == val){
			return n2;
		}
		
		if(val < n2.getVal()){
			if(n2.getLeft() != null){
				return search(n2.getLeft(),val);
			}else{
				return n2;
			}
		}else{
			if(n2.getRight() != null){
				return search(n2.getRight(),val);
			}else{
				return n2;
			}
		}
	}
	
	public Node search3(Node n, int val){
		ThreeNode n3 = (ThreeNode) n;
		int val1 = n3.getVal1();
		int val2 = n3.getVal2();
		
		if(val1 == val){
			return n3;
		}
		
		if(val2 == val){
			return n3;
		}
		
		if(val < val1){
			if(n3.getLeft() != null){
				return search(n3.getLeft(),val);
			}else{
				return n3;
			}
		}else if(val > val2){
			if(n3.getRight() != null){
				return search(n3.getRight(),val);
			}else{
				return n3;
			}
		}else{
			if(n3.getMiddle() != null){
				return search(n3.getMiddle(),val);
			}else{
				return n3;
			}
		}
	}
	
	public void insert(Node n, int val){
		Node q = search(n,val);
		if(q.getValue1() != val && q.getValue2() != val || q.getValue2() == -9999999){
			if(q instanceof TwoNode){
				ThreeNode temp = new ThreeNode(q.getValue1(),val);
				temp.setParent(((TwoNode) q).getParent());
				q = temp;
			}else{
				
			}
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
}
