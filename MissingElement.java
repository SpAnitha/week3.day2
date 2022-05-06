package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MissingElement {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("6");
		list.add("7");
		list.add("8");
		{

		Collections.sort(list);
		System.out.println("The sorted list values are: "+list);
			}
		}

}
