import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add(10);
		v1.add(20);
		v1.addElement(30);
		v1.addElement(50);
		
		Enumeration e1 = v1.elements();
			while(e1.hasMoreElements()) {
				System.out.println(e1.nextElement());
			}
			Iterator i1 = v1.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
		}
	}


