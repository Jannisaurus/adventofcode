package adventofcode;

import java.util.ArrayList;

public class Stack {
	private ArrayList<String> crates; 
	
	public Stack() {
		this.crates = new ArrayList<String>(); 
	}
	
	public void addCrate(String crate) {
		this.crates.add(crate); 
	}
	
	public ArrayList<String> getCrates() {
		return crates;
	}
	
	public void moveCrate(Stack stack, Stack stack2) {
		int topCrate = crates.size() - 1; 
		System.out.println(topCrate);
		System.out.println(crates.get(topCrate));
	}
	
	public void seeCrates() {
		int topCrate = crates.size() - 1; 
		System.out.println(topCrate);
		System.out.println(crates.get(topCrate));
	}
	

}
