//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		
		String[] words = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		toRemove=rem;
		Iterator<String> itera= list.iterator();
		while(itera.hasNext()) {
			String pos = itera.next();
			if(pos.equals(toRemove)||pos.equals("")) {
				itera.remove();
			}
		}
		System.out.println(list.toString());
		
		
	}

}