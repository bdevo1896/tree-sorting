package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import binary.BSTree;
import binary.Node;

public class BSTreeTests {

	@Test
	public void testGen() {
		BSTree bst = new BSTree();
		assertTrue(bst.getRoot() == null);
		
		BSTree bst1 = new BSTree(3);
		assertTrue(bst1.getRoot()!=null && bst1.getRoot().getVal() == 3);
		
		BSTree bst2 = new BSTree(new Node(5));
		assertTrue(bst2.getRoot()!=null && bst2.getRoot().getVal() == 5);
	}
	
	@Test
	public void testInsert(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		testTree.insert(testTree.getRoot(), 2);
		testTree.insert(testTree.getRoot(), 3);
		testTree.insert(testTree.getRoot(), 7);
		testTree.insert(testTree.getRoot(), 6);
		testTree.insert(testTree.getRoot(), 8);
		testTree.insert(testTree.getRoot(), 1);
		testTree.insert(testTree.getRoot(), 5);
		
		/*
		 * It will be modeled with the following numbers inserted.
		 * 4,2,3,7,6,8,1,5
		 * So the tree should look like this:
		 * 					4
		 * 		2					7
		 * 1		3			6		8
		 * 					5
		 * 
		 */
		
		assertTrue( "Value at root is: "+testTree.getRoot().getVal(),testTree.getRoot().getVal() == 4);
		assertTrue("Value to left of root: "+testTree.getRoot().getLeft().getVal(),testTree.getRoot().getLeft().getVal() == 2);
		assertTrue("Value to left of 2 Node: "+testTree.getRoot().getRight().getVal(),testTree.getRoot().getLeft().getLeft().getVal() == 1);
		assertTrue("Value to right of 2 Node: "+testTree.getRoot().getLeft().getRight().getVal(),testTree.getRoot().getLeft().getRight().getVal() == 3);
		assertTrue("Value to right of root: "+testTree.getRoot().getLeft().getLeft().getVal(),testTree.getRoot().getRight().getVal() == 7);
		assertTrue("Value to left of 7 Node: "+testTree.getRoot().getRight().getLeft().getVal(),testTree.getRoot().getRight().getLeft().getVal() == 6);
		assertTrue("Value to left of 6 Node: "+testTree.getRoot().getRight().getLeft().getLeft().getVal(),testTree.getRoot().getRight().getLeft().getLeft().getVal() == 5);
		assertTrue("Value to right of 7 Node: "+testTree.getRoot().getRight().getRight().getVal(),testTree.getRoot().getRight().getRight().getVal() == 8);
	}
	
	@Test
	public void testGetHeight_With_Nodes_In_Tree(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		testTree.insert(testTree.getRoot(), 2);
		testTree.insert(testTree.getRoot(), 3);
		testTree.insert(testTree.getRoot(), 7);
		testTree.insert(testTree.getRoot(), 6);
		testTree.insert(testTree.getRoot(), 8);
		testTree.insert(testTree.getRoot(), 1);
		testTree.insert(testTree.getRoot(), 5);
		
		/*
		 * It will be modeled with the following numbers inserted.
		 * 4,2,3,7,6,8,1,5
		 * So the tree should look like this:
		 * 					4
		 * 		2					7
		 * 1		3			6		8
		 * 					5
		 * 
		 */
		assertTrue(4 == testTree.getHeight(testTree.getRoot()));
	}
	
	@Test
	public void testGetHeight_With_No_Nodes(){
		BSTree testTree = new BSTree();
		assertTrue(0 == testTree.getHeight(testTree.getRoot()));
	}
	
	@Test
	public void testSearch_With_Node_In_Tree(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		testTree.insert(testTree.getRoot(), 2);
		testTree.insert(testTree.getRoot(), 3);
		testTree.insert(testTree.getRoot(), 7);
		testTree.insert(testTree.getRoot(), 6);
		testTree.insert(testTree.getRoot(), 8);
		testTree.insert(testTree.getRoot(), 1);
		testTree.insert(testTree.getRoot(), 5);
		
		assertTrue(testTree.search(testTree.getRoot(), 5).getVal() == 5);
		
	}
	
	@Test
	public void testSearch_False_Without_Node_In_Tree(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		
		assertTrue(testTree.search(testTree.getRoot(), 5) == null);
	}
	
	@Test
	public void testPrintInOrder_With_Nodes(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		testTree.insert(testTree.getRoot(), 2);
		testTree.insert(testTree.getRoot(), 3);
		testTree.insert(testTree.getRoot(), 7);
		testTree.insert(testTree.getRoot(), 6);
		testTree.insert(testTree.getRoot(), 8);
		testTree.insert(testTree.getRoot(), 1);
		testTree.insert(testTree.getRoot(), 5);
		
		/*
		 * It will be modeled with the following numbers inserted.
		 * 4,2,3,7,6,8,1,5
		 * So the tree should look like this:
		 * 					4
		 * 		2					7
		 * 1		3			6		8
		 * 					5
		 * 
		 */
		
		String testStr = testTree.printInOrder();
		
		assertTrue("Actual String: "+testStr, "12345678".equals(testStr));
		
	}
	
	@Test
	public void testPrintPostOrder_With_Nodes(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		testTree.insert(testTree.getRoot(), 2);
		testTree.insert(testTree.getRoot(), 3);
		testTree.insert(testTree.getRoot(), 7);
		testTree.insert(testTree.getRoot(), 6);
		testTree.insert(testTree.getRoot(), 8);
		testTree.insert(testTree.getRoot(), 1);
		testTree.insert(testTree.getRoot(), 5);
		
		/*
		 * It will be modeled with the following numbers inserted.
		 * 4,2,3,7,6,8,1,5
		 * So the tree should look like this:
		 * 					4
		 * 		2					7
		 * 1		3			6		8
		 * 					5
		 * 
		 */
		
		String testStr = testTree.printPostOrder();
		
		assertTrue("Actual String: "+testStr, "13256874".equals(testStr));
		
	}
	
	@Test
	public void testPrintPreOrder_With_Nodes(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		testTree.insert(testTree.getRoot(), 2);
		testTree.insert(testTree.getRoot(), 3);
		testTree.insert(testTree.getRoot(), 7);
		testTree.insert(testTree.getRoot(), 6);
		testTree.insert(testTree.getRoot(), 8);
		testTree.insert(testTree.getRoot(), 1);
		testTree.insert(testTree.getRoot(), 5);
		
		/*
		 * It will be modeled with the following numbers inserted.
		 * 4,2,3,7,6,8,1,5
		 * So the tree should look like this:
		 * 					4
		 * 		2					7
		 * 1		3			6		8
		 * 					5
		 * 
		 */
		
		String testStr = testTree.printPreOrder();
		
		assertTrue("Actual String: "+testStr, "42137658".equals(testStr));
		
	}
	
	@Test
	public void testGetMax(){
		BSTree testTree = new BSTree();
		testTree.insert(null, 4);//Inserting to root
		testTree.insert(testTree.getRoot(), 2);
		testTree.insert(testTree.getRoot(), 3);
		testTree.insert(testTree.getRoot(), 7);
		testTree.insert(testTree.getRoot(), 6);
		testTree.insert(testTree.getRoot(), 8);
		testTree.insert(testTree.getRoot(), 1);
		testTree.insert(testTree.getRoot(), 5);
		
		
		assertTrue(8 == testTree.getMax());
	}
	
}
