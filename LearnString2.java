package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnString2 {
	public static void main(String[]args) {
		List<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("G");
		list.add("F");
		list.add("C");
		list.contains("A");
		list.contains("C");
		Set<String> set=new HashSet<String>();
		for(String values:list) {
			if(set.add(values)==false)
				System.out.println(values);
			}
		
}

}