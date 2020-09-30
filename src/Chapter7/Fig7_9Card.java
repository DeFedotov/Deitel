package Chapter7;

// Card class represents a playing card.

public class Fig7_9Card {

	private final String face;
	private final String suit;

	public Fig7_9Card(String cardFace, String cardSuit){

		this.face = cardFace;
		this.suit = cardSuit;
	}

	public String toString(){

		return face + "of" + suit;

	}
}
