package hashtable;

import java.util.LinkedList;

public class HashTable {
	private LinkedList<Integer>[] list; 
	private static final int entries = 5;
	
	public HashTable(){
		list = new LinkedList[entries];
		for(int i = 0; i < list.length; i++){
			list[i] = new LinkedList<Integer>();
		}
	}
	
	/**
	 * This will add a element through the hash method: D(k,i) = (h1(k) + i * h2(k))%mod
	 */
	public void insert(int val){
		int index = val % entries;
		
		if(index >= 0 && index <= list.length-1){
			list[index].add(val);
		}
	}
	
	public boolean search(int val){
		int index = val % entries;
		
		if(index >= 0 && index <= list.length-1){
			return list[index].contains(val);
		}
		return false;
	}
	
	public void delete(int val){
		int index = val % entries;
		
		LinkedList<Integer> dList = list[index];
		for(int i = 0; i < dList.size();i++){
			if(val == dList.get(i)){
				dList.remove(i);
			}
		}
	}

	public LinkedList<Integer>[] getList() {
		return list;
	}
	
	
}
