package Java_Final_Project_War;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.setScore(0);
	}
	
	public void describe() {
		System.out.println(name + " has the following cards in hand: ");
		for (Card card : hand) {
			card.describe(card);
		}
	}

	public Card flip() {      //removes and returns the top card of the hand. If hand is empty, it will throw a message.
		if (hand.isEmpty() ) {
			throw new IllegalStateException("Hand is empty!");
		}
		
		return hand.remove(0); // returns the card at the first index, aka the top card.
	}
	
	public void draw(Deck deck) {   //calls the draw method on the deck and adds the returned card to the hand field.
		Card drawnCard = deck.draw();
		hand.add(drawnCard);
	}
	
	public void incrementScore() {  //counter for the score / adds 1 to the Player's score field.
		setScore(getScore() + 1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
