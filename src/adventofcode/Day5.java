package adventofcode;

import java.util.ArrayList; 

public class Day5 {
	public static void main(String[] args) {
		Stack stack1 = new Stack(); 
		Stack stack2 = new Stack();
		Stack stack3 = new Stack();
		Stack stack4 = new Stack();
		Stack stack5 = new Stack();
		Stack stack6 = new Stack();
		Stack stack7 = new Stack();
		Stack stack8 = new Stack();
		Stack stack9 = new Stack();
		
		stack1.addCrate("W");
		stack1.addCrate("M");
		stack1.addCrate("L");
		stack1.addCrate("F");
		
//		stack1.seeCrates();
		
		String[] fromData = {"A","B","C"};
		ArrayList<String> fromList = new ArrayList<String>();
		
		for (int i = 0; i < fromData.length; i++) {
			fromList.add(fromData[i]);
		}
		System.out.println(fromList);
		
		String[] toData = {"1","2","3","4"};
		ArrayList<String> toList = new ArrayList<String>();
		
		for (int i = 0; i < toData.length; i++) {
			toList.add(toData[i]);
		}
		System.out.println(fromList);
		
		
	}
}
