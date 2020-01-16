
public class BlackJackCard extends Card{
	public BlackJackCard() {
		super();
	}
	
	public BlackJackCard(int value, String suit) {
		super(value, suit);
	}
	
	public int getValue() {
		if (getFace() == 1)
			return 11;
		else if (getFace() > 1 && getFace()< 11)
			return getFace();
		else if (getFace() >= 11 )
			return(10);
		else
			return 0;
	}

}
