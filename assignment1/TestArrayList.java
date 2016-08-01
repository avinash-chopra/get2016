package assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArrayList {

	ArrayList<String> arrayList, reverseArraylist;

	@Before
	public void setUp() throws Exception {

		arrayList = new ArrayList<String>();
	}

	@Test
	public void testAddE() {

		assertEquals("Success", true, arrayList.inseartAtEnd("hello"));
		assertEquals("Success", true, arrayList.inseartAtEnd("my"));
		assertEquals("Success", true, arrayList.inseartAtEnd("name"));

	}

	@Test
	public void testAddIntE() {

		assertEquals("Success", true, arrayList.insertAtPosition(0, "hello"));
		assertEquals("Success", true, arrayList.insertAtPosition(1, "my"));
		assertEquals("Success", true, arrayList.insertAtPosition(2, "name"));

	}

	@Test
	public void testRemoveInt() {

		assertEquals("Success", true, arrayList.deleteByIndex(6));
		assertEquals("Success", true, arrayList.deleteByIndex(7));
		assertEquals("Success", true, arrayList.deleteByIndex(8));
		assertEquals("Success", true, arrayList.deleteByIndex(9));

	}

	@Test
	public void testRemoveE() {

		assertEquals("Success", true, arrayList.deleteByValue("Avinash"));
		assertEquals("Success", true, arrayList.deleteByValue("hello"));
		assertEquals("Success", true, arrayList.deleteByValue("is"));
		assertEquals("Success", true, arrayList.deleteByValue("my"));

	}

	@Test
	public void testGetIndex() {

		assertEquals("Success", true, arrayList.inseartAtEnd("people"));
		assertEquals("Success", true, arrayList.inseartAtEnd("hello"));
		assertEquals("Success", 0, arrayList.getIndex("people"));
		assertEquals("Success", 1, arrayList.getIndex("hello"));

	}

	@Test
	public void testGetElement() {

		assertEquals("Success", true, arrayList.inseartAtEnd("hello"));
		assertEquals("Success", true, arrayList.inseartAtEnd("Avinash"));
		assertEquals("Success",true, arrayList.getElement(0));
		assertEquals("Success",true, arrayList.getElement(1));
	}

	@Test
	public void testReverseList() {

		assertEquals("Success", true, arrayList.inseartAtEnd("hello"));
		assertEquals("Success", true, arrayList.inseartAtEnd("Avinash"));
		assertEquals("Success", true, arrayList.inseartAtEnd("welcome"));

		arrayList.reverseList();

		assertEquals("welcome", arrayList.getElementAtLocation(0));
		assertEquals("Avinash", arrayList.getElementAtLocation(1));
		assertEquals("hello", arrayList.getElementAtLocation(2));

	}

	@Test
	public void testClearList() {

		assertEquals("Success", true, arrayList.clearList());
	}

	@Test
	public void testSortList() {

	}

}
