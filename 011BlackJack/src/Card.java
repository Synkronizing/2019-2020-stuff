import java.lang.reflect.Array;
import java.util.Random;

public class Card {
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	public static final String SUITS[] = { "SPADES", "DIAMONDS", "HEARTS", "CLUBS"};
	private String suit;
	private int face;
   

	//constructors
	Card(){
		Random rn = new Random();
		int sindex= rn.nextInt(3);
		int findex = rn.nextInt(13)+1;
		//this.suit=(String)Array.get(FACES, sindex);
		//this.face=findex;
		this.suit="";
		this.face=0;
	}
	public Card(int f, String s) {
		this.face=f;
		this.suit=s;
	}
	
	//set methods
	public void setFace(int f) {
		face = f;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	//get methods 
	public String getSuit() {
		return suit;
	}
	
	public int getFace() {
		return face;
	}


	public int getValue()
	{
		return face;
	}

    
	//equals method
	public boolean equals(Object card) {
		if (card instanceof Card) {
			Card c = (Card) card;
			return face == c.face && suit.equals(c.suit);
		} else
			return false;
	}


	public String toString()
	{
		return FACES[face] + " of " + getSuit() + " | value = " + getValue();
	}
	


}

