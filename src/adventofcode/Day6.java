package adventofcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList; 

public class Day6 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\janni\\Documents\\Programming\\Code of advent\\input6.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st = br.readLine();
		
		char[] bob = st.toCharArray();
		
//		ArrayList<String> compare = new ArrayList<String>(); 
		char tmp1 = 'b'; 
		char tmp2 = 'g'; 
		char tmp3 = 'd'; 
		
		int count = 3; 
		
		for (char temp : bob) {
			if (temp != tmp1 && temp != tmp2 && temp != tmp3) {
				count++;
				System.out.println(count);
			} 
			else if (temp == tmp1 || temp == tmp2 || temp == tmp3) {
				tmp1 = tmp2; 
				tmp2 = tmp3; 
				tmp3 = temp; 
				
				System.out.println(tmp1);
				System.out.println(tmp2);
				System.out.println(tmp3);
				count++; 
			} 
		}
		
	}

}
