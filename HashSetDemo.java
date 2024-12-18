import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1 = new HashSet();
		h1.add(30);
		h1.add(20);
		h1.add(50);
		h1.add(54);
		h1.add(20);
		
		Iterator i1 = h1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}
	
}
