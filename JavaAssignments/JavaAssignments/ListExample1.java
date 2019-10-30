package JavaAssignments;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		
		list.remove("item2");
		
		list.remove(2);
		
		list.set(0, "item1update");
		
		for (int i = 0; i<list.size(); i++) 
		{
			System.out.println(list.get(i) + "::" +i);
		}

	}

}
