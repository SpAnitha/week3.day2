package week3.day2;

import java.util.ArrayList;
import java.util.List;


public class CharOccurance {
	public static void main(String[]args) {
		List<String> list= new ArrayList<String>();
		list.add("Welcome");
		list.add("to");
		list.add("chennai");
		String String = "welcome to chennai";
		int count=0;
		for(char ch:String.toCharArray()) {
			if(ch=='e')
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
