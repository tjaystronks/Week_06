package Java_Final_Project_War;

public class Card {
	
	private int value; //contains a value from 2-14 representing cards 2-Ace
	private String name; // e.g. Ace of Diamonds, Two of Hearts, etc.
	
	
	public Card(int value, String name) { //method to pull card number and face
			this.value = value;
			this.name = name;
	}
	
	public int getValue() {
			return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void describe(Card card) {
		System.out.println(card.name); //print out the face of the card
	}
}

