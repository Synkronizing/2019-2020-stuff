package monsters;

public class Monster
{
	private String myName = "long way to go for a toString()";
	private static int count=0;

	public Monster()
	{
		myName = "Monster";
		count++;
	}

	public Monster( String name )
	{
		myName = name;
		count++;
	}

	public String toString( )
	{
		return myName;
	}
}