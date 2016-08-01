package assignment_2;

import assignment_1.ArrayList;

/**
 * 
 * @author Avinash
 * @Date 28 july 2016
 */
// class List to merge two lists
public class List {
	public static void main(String[] args) {
		// object of list
		List list = new List();
		// creating arraylist1 by using the previous class made in assignment
		// one
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		// adding random elements in arraylist 1
		for (int i = 0; i <= 20; ++i) {
			arrayList1.inseartAtEnd(i);
		}
		// creating arraylist2
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		// adding random elements in arraylist2
		for (int i = 21; i <= 40; ++i) {
			arrayList2.inseartAtEnd(i);
		}
		// merging two lists
		arrayList1 = list.mergeList(arrayList1, arrayList2);
		// printing merged list
		System.out.println("Merged List: ");

		for (int i = 0; i < arrayList1.size(); ++i) {
			System.out.println(arrayList1.getIndex(i));
		}
	}

	/**
	 * 
	 * @param arrayList1
	 * @param arrayList2
	 * @return merged array list
	 * 
	 *         this method adds arraylist2 to arraylist1
	 */
	public ArrayList<Integer> mergeList(ArrayList<Integer> arrayList1,
			ArrayList<Integer> arrayList2) {

		for (int i = 0; i < arrayList2.size(); ++i) {

			arrayList1.inseartAtEnd(arrayList2.getElementAtLocation(i));
		}

		return arrayList1;
	}

}
