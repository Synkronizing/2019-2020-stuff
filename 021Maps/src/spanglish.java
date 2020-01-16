import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class spanglish {

	public spanglish(ArrayList<String> all) {
		// TODO Auto-generated constructor stub
		Integer count = Integer.parseInt(all.get(0));
		ArrayList<String[]> translation = new ArrayList<String[]>();
		Map<String,String> translate = new HashMap<String,String>();
		for(int a=1;a<count;a++) {
			String[] temp = all.get(a).split(" ");
			translate.put(temp[0], temp[1]);
		}
		for(int b=count+1;b<all.size();b++) {
			String[] temp = all.get(b).split(" ");
			translation.add(temp);
		}
		for(String[] smalltemp : translation) {
			String print = "";
			for(String pos : smalltemp) {
				print= print+ translate.get(pos)+" ";
			}
			System.out.println(print);
		}
		
	}



}
