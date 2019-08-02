package tests;

import static org.junit.Assert.*;

import java.util.LinkedList;

import hashtable.HashTable;

import org.junit.Test;

public class HashTableTests {

	@Test
	public void testGen() {
		HashTable tb = new HashTable();
		assertTrue(tb.getList() != null);
	}
	
	@Test
	public void testInsert(){
		HashTable tb = new HashTable();
		
		int[] testNums = {5,8,1,12};
		for(int i: testNums){
			tb.insert(i);
		}
		
		LinkedList<Integer>[] tList = tb.getList();
		
		assertTrue(tList[0].contains(testNums[0]));
		assertTrue(tList[3].contains(testNums[1]));
		assertTrue(tList[1].contains(testNums[2]));
		assertTrue(tList[2].contains(testNums[3]));
	}
	
	@Test
	public void testSearchFalse(){
		HashTable tb = new HashTable();
		
		assertFalse(tb.search(1));
		
	}
	
	@Test
	public void testSearchTrue(){
		HashTable tb = new HashTable();
		
		tb.getList()[0].add(5);
		
		assertTrue(tb.search(5));
	}
	
	@Test
	public void testDelete(){
		HashTable tb = new HashTable();
		tb.insert(3);
		tb.insert(10);
		tb.insert(22);
		tb.insert(44);
		
		tb.delete(44);
		
		assertFalse(tb.search(44));
	}

}
