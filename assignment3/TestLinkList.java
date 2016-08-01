package session1_singlyLinkList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinkList {

	LinkList<Integer> list   ;
	@Before
	public void setUp() throws Exception { 
		list  = new LinkList<Integer>();
	}

	@Test
	public void testInseartAtEnd() {
		assertEquals("Success", true, list.inseartAtEnd(10));
		assertEquals("Success", true, list.inseartAtEnd(20));
		assertEquals("Success", true, list.inseartAtEnd(30));
	}

	@Test
	public void testInsertAtPosition() {
		assertEquals("Success", true, list.inseartAtEnd(10));
		assertEquals("Success", true, list.inseartAtEnd(20));
		assertEquals("Success", true, list.inseartAtEnd(30));
		assertEquals("Success", true, list.insertAtPosition(2,40));
	}

	@Test
	public void testDeleteByValue() {
		assertEquals("Success", true, list.inseartAtEnd(10));
		assertEquals("Success", true, list.inseartAtEnd(20));
		assertEquals("Success", true, list.inseartAtEnd(30));
		assertEquals("Success", true, list.deleteByValue(30));
	}

	@Test
	public void testDeleteByIndex() {
		assertEquals("Success", true, list.inseartAtEnd(10));
		assertEquals("Success", true, list.inseartAtEnd(20));
		assertEquals("Success", true, list.inseartAtEnd(30));
		assertEquals("Success", true, list.deleteByIndex(3));
	}

}
