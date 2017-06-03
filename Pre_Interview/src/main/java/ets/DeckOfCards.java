package ets;

import java.lang.*;

public class DeckOfCards {
	private Card[] deck;
	private int cardsUsed;
	String[] suits ={"SPADE","HEART","CLUB","DIAMOND"};
	String faces[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	//constructor to create deck of cards
	public DeckOfCards() {
		deck = new Card[52];
		int count=0;
		for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[count] = new Card(face,suit);
                count++;
            }
        }
		cardsUsed = 0;
	}
	
	public static void main(String args[])
	{
		DeckOfCards myDOC = new DeckOfCards();
		myDOC.shuffle(); // shuffle cards
		// print Cards in the order they are dealt
		System.out.println("Order in which cards are dealt");
		for (int i = 0; i < 13; i++)
			System.out.printf("%-25s%-25s%-25s%-25s\n", myDOC.dealOneCard(), myDOC.dealOneCard(), myDOC.dealOneCard(), myDOC.dealOneCard());
	} 
	
	//shuffle deck of cards
	public void shuffle() {
		 for (int i = deck.length-1; i > 0; i--) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
	}
	
	//deal one card
	public Card dealOneCard() {
		if(cardsUsed < deck.length) 
			return deck[cardsUsed++];
		else
			throw new IllegalStateException("No card is dealt.");
	}
}