package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import twothree.TTTree;

public class TwoThreeTreeTests {

	@Test
	public void testGeneration() {
		TTTree tree = new TTTree();
		assertTrue(tree.getRoot() == null);
	}
	
	@Test
	public void testSearch_With_Value_In_Tree(){
		TTTree tree = new TTTree();
	}

}
