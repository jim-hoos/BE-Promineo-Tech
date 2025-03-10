package com.promineotech.week06;

public class App {

	public static void main(String[] args) {
		// instantiate deck and both players
		Deck deck = new Deck();
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		
		// shuffle the deck
		deck.shuffle();
		// pass out all the cards to each player
		for (int i = 0; i < 52; i++) {
			Card card = deck.draw();
			if (i % 2 == 0) {
				player1.hand.add(card);
			} else {
				player2.hand.add(card);
			}
		}
		
		// print out the info before playing cards
		player1.describe();
		System.out.println();
		player2.describe();
		System.out.println();
		System.out.println("Let's play!");
		System.out.println("-----------------------------");
		
		// start playing by each player flipping over a card from their hand
		for (int j = 0; j < 26; j++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			// compare the cards and award a point if appropriate
			if (card1.value > card2.value) {
				player1.incrementScore();
				System.out.println(player1.name + " received a point " + "(" + card1.value + ":" + card2.value + ")");
			} else if (card2.value > card1.value) {
				player2.incrementScore();
				System.out.println(player2.name + " received a point " + "(" + card2.value + ":" + card1.value + ")");
			} else {
				System.out.println("no point was awarded " + "(both had " + card1.value + ")");
			}
		}
		
		System.out.println();
		
		// compare player scores and award a winner if appropriate
		if (player1.score > player2.score) {
			System.out.println(player1.name + " wins! (" + player1.score + ":" + player2.score + ")");
		} else if (player2.score > player1.score) {
			System.out.println(player2.name + " wins! (" + player2.score + ":" + player1.score + ")");
		} else {
			System.out.println(player1.name + " and " + player2.name + " draw! at " + player1.score + " each");
		}
	}

}
