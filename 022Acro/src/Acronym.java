import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Acronym {

	public Acronym(ArrayList<String> all) {
		// TODO Auto-generated constructor stub
		Integer count =Integer.parseInt(all.get(0));
		ArrayList<String[]> translation = new ArrayList<String[]>();
		Map<String,String> Acronyms = new HashMap<String,String>();
		for(int a=1;a<count;a++) {
			String[] temp = all.get(a).split("-");
			String temp1 = temp[0].substring(0,temp[0].length()-1);
			String temp2 = temp[1].substring(1,temp[1].length());
			Acronyms.put(temp1, temp2);
		}
		for(int b=count+1;b<all.size();b++) {
			String[] temp = all.get(b).split(" ");
			translation.add(temp);
		}
		for(String[] smalltemp : translation) {
			String print = "";
			for(String pos : smalltemp) {
				boolean printed = false;
				for(String toTrans:Acronyms.keySet()) {
					if(pos.equals(toTrans)&&printed==false) {
						print= print+ Acronyms.get(pos)+" ";
						printed = true;
					}
					else if(pos.equals(toTrans+".")&&printed==false) {
						print= print+ Acronyms.get(toTrans)+". ";
						printed = true;
					}
					
				}
				if(printed==false) {
					print=print+ pos+" ";
					printed = true;
				}
			}
			System.out.println(print);
		}
	}

}
