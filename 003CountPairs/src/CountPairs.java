
public class CountPairs {
	public CountPairs(String word) {
		int count=0;
		for(int a=0; a< word.length()-1; a++) {
			if(word.charAt(a)==word.charAt(a+1)) {
				count++;
			}
		}
		System.out.print("The pair count is: "+count);
	}

}
