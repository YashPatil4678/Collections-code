import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(13);
		a1.add("Yash");
		a1.add(true);
		a1.add(456.789);
		
		//System.out.println(a1);
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		a1.add(3, 52);
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		a1.remove(3);
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}

}
