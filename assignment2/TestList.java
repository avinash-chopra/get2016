package assignment_2;


import org.junit.Before;
import org.junit.Test;

import assignment_1.ArrayList;

public class TestList {
	
	List list ;
	
	ArrayList<Integer> arrayList1 , arrayList2, mergedList;

	@Before
	public void setUp() throws Exception {		
		list = new List();		
		arrayList1 = new ArrayList<Integer>();
		arrayList2 = new ArrayList<Integer>();
		mergedList = new ArrayList<Integer>();
		for(int i = 2 ; i <= 10 ; ++i){
			arrayList1.inseartAtEnd(i);
		}
		for(int i = 11; i <= 20 ; ++i){	
			arrayList2.inseartAtEnd(i);
		}
		for(int i = 2 ; i <= 20; ++i){	
			mergedList.inseartAtEnd(i);
		}
	}
	@Test
	public void testMergeList() {
		System.out.println(arrayList1);
		System.out.println(arrayList2);
		assertArrayEquals(mergedList ,list.mergeList(arrayList1, arrayList2));
	}

	private void assertArrayEquals(ArrayList<Integer> mergedList2,
			ArrayList<Integer> mergeList) {
		
	}
}