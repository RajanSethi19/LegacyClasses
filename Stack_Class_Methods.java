package Legacy_Classes;

import java.util.Stack;

public class Stack_Class_Methods {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.addElement("Rajan");
		s.add("Sethi");
		s.add(10);
		s.addElement(22.33);
		s.push("Chandigarh");
		s.push(20);
		s.add('A');
		s.add(30f);
		System.out.println(s);
		
		s.peek();
		System.out.println(s.peek());
		//System.out.println("Peek method"+s);
		s.pop();
		System.out.println("POP method:-"+s);
		
		

	}

}
