//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		String words = "a b c c d e f g h i j k    c";
		char temp=words.charAt(words.length()-1);
		String rem = String.valueOf(temp);
		IteratorRemover line= new IteratorRemover(words,rem);
		
	}
}