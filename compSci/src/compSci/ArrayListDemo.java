package compSci;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> roster = new ArrayList<String>();
		roster.add("Tyler");
		roster.add("Brenda");
		roster.add("Gretchen");
		roster.add("Devin");
		roster.add("Brian");
		roster.add("Elizabeth");
		roster.add(4, "Phil");
		roster.add(4, "Nathan");
		roster.set(roster.indexOf("Elizabeth"), "Ellie");
		for( int i = 0; i <= 2; i++){
			String kewlNames = roster.remove((int)(Math.random() * roster.size()));
			System.out.println(kewlNames);
		}
		
		System.out.println(roster);
//		ArrayList<Integer> numObjs = new ArrayList<Integer>();
//		for(int i = 0; i < 20; i ++){
//			numObjs.add((int)(10 * Math.random()));
//		}
//		System.out.println(numObjs);
//		for(Integer n: numObjs){
//			
//		}
//		for(int i = 0; i < numObjs.size(); i ++){
//			System.out.print(numObjs.get(i) + " ");
//		}
	}

}
