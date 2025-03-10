package com.promineotech.week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	Map<Integer, String> cardDictionary = new LinkedHashMap<>();

	final String[] suits = new String[] { "Clubs", "Diamonds", "Hearts", "Spades"};
	
	public Deck() {
		// populate card dictionary
		cardDictionary.put(2, "Two");
		cardDictionary.put(3, "Three");
		cardDictionary.put(4, "Four");
		cardDictionary.put(5, "Five");
		cardDictionary.put(6, "Six");
		cardDictionary.put(7, "Seven");
		cardDictionary.put(8, "Eight");
		cardDictionary.put(9, "Nine");
		cardDictionary.put(10, "Ten");
		cardDictionary.put(11, "Jack");
		cardDictionary.put(12, "Queen");
		cardDictionary.put(13, "King");
		cardDictionary.put(14, "Ace");
		
		// add cards to deck
		for (String suit : suits) {
			for (Map.Entry<Integer, String> entry : cardDictionary.entrySet()) {
				cards.add(new Card(entry.getValue() + " of " + suit, entry.getKey()));
			}
		}
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.removeFirst();
	}

}
