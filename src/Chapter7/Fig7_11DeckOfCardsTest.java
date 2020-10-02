package Chapter7;

// Card shuffling and dealing.

public class Fig7_11DeckOfCardsTest {

	public static void main(String[] args) {

		Fig7_10DeckOfCards myDeckOfCards = new Fig7_10DeckOfCards();
		myDeckOfCards.shuffle();

		for (int i = 1; i <= 52; i++){

			System.out.printf("%-19s", myDeckOfCards.dealCard());

			if (i % 4 == 0){
				System.out.println();
			}
		}
	}
}
