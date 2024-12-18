import java.util.Arrays;
import java.util.Collections;
import java.util.List; 

public class ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a1 = {23, 45, 34, 44, 74, 55, 23, 30};
		List list1 = Arrays.asList(a1);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
	}

}
