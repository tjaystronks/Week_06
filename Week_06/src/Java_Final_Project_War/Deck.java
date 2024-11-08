package Java_Final_Project_War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;

	public Deck() {
	
	cards = new ArrayList<>();
	
	initializeDeck();
		
	
	}
	
	private void initializeDeck() {
		String[] suits = {"Hearts \u2661" , "Diamonds \u2662", "Clubs \u2667", "Spades \u2664"};
		String[] valueNames = {"Two", "Three", "Four", "Five", "Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		
		for (String suit : suits) {
			for (int value = 2; value <= 14; value++) {
				String valueName = valueNames[value - 2];
				String cardName = valueName + " of " + suit;
				cards.add(new Card(value, cardName));
			}
		}
		
	} 
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		if (cards.isEmpty()) {
			throw new IllegalStateException("Deck is empty!");
		}
		return cards.remove(cards.size() - 1);
	}
	
}