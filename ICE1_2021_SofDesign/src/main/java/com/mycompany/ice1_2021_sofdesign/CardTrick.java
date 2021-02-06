/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ice1_2021_sofdesign;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class CardTrick {

    private TurnManager cards;
    private int value;
    private int possible;
    private int intTemp;

    public int getValue() {
        return value;
    }

    public int getPossible() {
        return possible;
    }

    public TurnManager getCard() {
        return cards;
    }

    public int getIntTemp() {
        return intTemp;
    }

    public void setCards(TurnManager newCards) {
        this.cards = newCards;
    }

    public static void main(String[] args) {

        //Create: 
        Deck testDeck = new Deck();
        TurnManager manager = new TurnManager();
        InputStuff input = new InputStuff();
        
        //Set: 
        testDeck.initDI(new Card(), new ArrayList<>());
        testDeck.setSuits();
        testDeck.setInitDeck();
        testDeck.shuffle(testDeck.getDeck());
        manager.setHand(manager.createHand(7, testDeck.getDeck()));
        manager.printHand(manager.getHand());
        
        
        //Ask: 
        //System.out.println("Whats the value of the card your thinking of: E.g., 1-13");
        //int uValue = input.promptIntUser(new Scanner(System.in));
        //System.out.println("What is the suit of the card you thinking of ? E.g., clubs...");
        //String uSuit = input.promptStringUser(new Scanner(System.in));
        
        Card luckyCard = new Card("DIAMONDS", 7);
        
        //Test: 
        //manager.isItHere(manager.getHand(), uValue, uSuit);
        manager.isItHereAgain(manager.getHand(), luckyCard);
        
    }

}
