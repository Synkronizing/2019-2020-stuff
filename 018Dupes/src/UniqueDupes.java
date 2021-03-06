import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueDupes {


	public UniqueDupes(String words) {
		// TODO Auto-generated constructor stub
		String[] base = words.split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(base));
		System.out.println("Original list: "+ list);
		Set<String> set = new TreeSet<String>(Arrays.asList(base));
		System.out.println("Uniques: "+set);
		Set<String> dupes = FindDupes(base);
		System.out.println("Duplicates: "+dupes);
		
	}

	public Set<String> FindDupes(String[] words) {
		// TODO Auto-generated constructor stub
		final Set<String> setToReturn = new HashSet<>(); 
		final Set<String> set1 = new HashSet<>();
		for (String yourInt : words)
		  {
		   if (!set1.add(yourInt))
		   {
		    setToReturn.add(yourInt);
		   }
		  }
		return setToReturn;
	}
	

}
