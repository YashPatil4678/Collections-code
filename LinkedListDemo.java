import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;


public class LinkedListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.addFirst(12);
		list1.add(75);
		list1.add(86);
		list1.add(24);
		
		Iterator i1 = list1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		ListIterator l1 = list1.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		System.out.println("List in reverse order :\n");
		ListIterator l2 = list1.listIterator(list1.size());
		while(l2.hasPrevious()) {
			System.out.println(l2.previous());
		}
	}

}
