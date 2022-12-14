package adventofcode;

import java.util.ArrayList; 
import java.lang.Object; 
import java.io.*;

public class Day5 {
	public static void main(String[] args) throws Exception {
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
		File file = new File("C:\\Users\\janni\\Documents\\Programming\\Code of advent\\input5.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String[] fromData = {"A","B","C"};
		ArrayList<String> fromList = new ArrayList<String>();
		
		for (int i = 0; i < fromData.length; i++) {
			fromList.add(fromData[i]);
		}
//		System.out.println(fromList);
		
		String[] toData = {"1","2","3","4"};
		ArrayList<String> toList = new ArrayList<String>();
		
		for (int i = 0; i < toData.length; i++) {
			toList.add(toData[i]);
		}
		String st; 
		while((st = br.readLine()) != null) {
			String doThis[] = st.split(" ");
			String moveThis = doThis[1];
			String fromThis = doThis[3]; 
			String toThis = doThis[5]; 
			
			int move = Integer.parseInt(moveThis); 
			int from = Integer.parseInt(fromThis); 
			int to = Integer.parseInt(toThis); 
				System.out.println(move); 

		}

		
		
		
	}
}
