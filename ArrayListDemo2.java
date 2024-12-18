import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list1 = new ArrayList();
		list1.add(15);
		list1.add(25);
		list1.add(55);
		list1.add(22);
		list1.add(77);
		
		ListIterator l1 = list1.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
			}
		System.out.println("-------------Sorted-----------------");
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("------------Reverse------------------");
		Collections.reverse(list1);
		System.out.println(list1);
	 	}
	}


