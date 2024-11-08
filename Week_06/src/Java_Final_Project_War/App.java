package Java_Final_Project_War;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle(); // calling on the shuffle method

		int tie = 0;

		Player player1 = new Player("Peter Griffin");
		Player player2 = new Player("Homer Simpson");

		// Distribute cards to players
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
			
		}

		player1.describe();
		System.out.println(); // blank line for legibility
		player2.describe();

		System.out.println("\n Let the games begin! \n");

		// Flip cards and compare values

		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			System.out.println("Round #: " + (i + 1) + "\n");
			System.out.print(player1.getName() + " flips: ");
			card1.describe(card1);
			System.out.print(player2.getName() + " flips: ");
			card2.describe(card2);

			// Winners of each round are determined and points are collected

			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " receives a point!");

			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " receives a point!");

			} else {
				System.out.println("It's a tie! No points awarded.");
				tie++;
			}
			System.out.println(player1.getName() + " has a score of " + player1.getScore());
			System.out.println(player2.getName() + " has a score of " + player2.getScore() + "\n");
			// System.out.println(); //Blank line for legibility

		} // End of Round For Loop

		// Display final scores

		System.out.println("Final Score: ");
		System.out.println(player1.getName() + " " + player1.getScore());
		System.out.println(player2.getName() + " " + player2.getScore());

		// Determine the winner

		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " " + "is the winner!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " " + "is the winner!");
		} else {
			System.out.println("Draw");
		}

		if (tie > 1) {
			System.out.println("There were " + tie + " tie rounds.");
		} else if (tie == 1) {
			System.out.println("There was " + tie + " tie round.");
		} else {
			System.out.println("There were no tie rounds.");
		}

	}

}
