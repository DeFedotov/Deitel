package Chapter7;

// DeckOfCards class represents a deck of playing cards.


import java.security.SecureRandom;

public class Fig7_10DeckOfCards {

	private Fig7_9Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;

	private static final SecureRandom randomNumbers = new SecureRandom();

	public Fig7_10DeckOfCards(){

		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
							"Jack", "Queen", "King" };

		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		deck = new Fig7_9Card[NUMBER_OF_CARDS];

		currentCard = 0;

		for (int count = 0; count < deck.length; count++){

			deck[count] = new Fig7_9Card(faces[count % 13], suits[count / 13]);

		}

	}

	public void shuffle(){

		currentCard = 0;

		for (int first = 0; first < deck.length; first++){

			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			Fig7_9Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;

		}
	}

	public Fig7_9Card dealCard(){

		if (currentCard < deck.length){
			return deck[currentCard++];
		} else {
			return null;
		}
	}

}
