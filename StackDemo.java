import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<Integer> s1 = new Stack();
			s1.push(30);
			s1.push(20);
			s1.push(10);
			System.out.println(s1);
			s1.pop();
			System.out.println(s1);
			System.out.println(s1.peek());
	}

}
