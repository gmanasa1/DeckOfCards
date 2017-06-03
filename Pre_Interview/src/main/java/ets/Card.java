package ets;

public class Card{
	public final static int SPADE = 1;   
    public final static int HEART = 2;
    public final static int DIAMOND = 3;
    public final static int CLUB = 4;
	
	public final static int ACE = 1;      
    public final static int JACK = 11;    
    public final static int QUEEN = 12;   
    public final static int KING = 13;
	
	private final int face;
	private final int suit;
	
	public Card(int cardFace, int cardSuit) {
        if (cardSuit != SPADE && cardSuit != HEART && cardSuit != DIAMOND && cardSuit != CLUB)
            throw new IllegalArgumentException("Not a valid card suit");
        if (cardFace > 13 || cardFace < 1)
            throw new IllegalArgumentException("Not a valid card face");
        face = cardFace;
        suit = cardSuit;
    }
	
	public String toString() {
		return face + " of " + suit;
	}	
}