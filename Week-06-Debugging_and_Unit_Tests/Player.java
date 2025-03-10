package com.promineotech.week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
	}
	
	public void describe() {
		System.out.println("Player name is " + name);
		System.out.println(name + " hand");
		System.out.println("-----------------------------");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public Card flip() {
		return hand.removeFirst();
	}
	
	public void incrementScore() {
		score++;
	}
}
