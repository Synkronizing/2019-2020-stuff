//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Dealer extends Player
{
	//define a deck of cards
	private Deck deckInPlay;
	public Dealer() {
		deckInPlay = new Deck();
	}

	public void  shuffle()
	{
	   //shuffle the deck
		deckInPlay.shuffle();
	}

	public Card  deal(){
	   return deckInPlay.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deckInPlay.size();
	}

	public boolean hit()
	{
		addCardToHand(new BlackJackCard());
	   return getHandValue()>21;
    }
}








