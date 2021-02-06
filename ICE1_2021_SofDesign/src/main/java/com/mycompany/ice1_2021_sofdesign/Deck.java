/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ice1_2021_sofdesign;

import java.util.ArrayList;

/**
 *
 * @author aleks
 */
public class Deck {

    private Card suit;
    private String[] suits;
    private ArrayList<Card> deck;
    //0:CLUBS | 1:SPADES | 2:DIAMONDS | 3:HEARTS

    //Call this first
    public void initDI(Card newSuits, ArrayList<Card> newDeck) {
        this.suit = newSuits;
        this.deck = newDeck;
        this.suits = suit.getSUITS();
        this.setInitDeck();
        this.deck = shuffle(deck);
    }

    public void printDeck() {
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.get(i).getValue());
        }
    }

    //Initialize deck with 4 of 1-13. 
    //Of objects as cards with 2 fields 
    public ArrayList<Card> initDeck(ArrayList<Card> tDeck) {

        //A: 
        for (int i = 1; i <= 13; i++) {
            //C: 
            for (int j = 0; j < 4; j++) {
                tDeck.add(new Card(suits[j], i));

            }
        }
        return tDeck;
    }

    public void setDeck(ArrayList<Card> newDeck) {
        this.deck = newDeck;
    }

    public void setInitDeck() {
        this.deck = initDeck(new ArrayList<>());
    }

    public Deck() {

    }

    public ArrayList<Card> getDeck() {

        return deck;
    }

    //Swap pairs of card objects at random positions / 52.
    public ArrayList<Card> shuffle(ArrayList<Card> tDeck) {

        //A: Create 
        int rando;
        for (int i = 0; i < 52 - 1; i++) {
            rando = (int) (Math.random() * 51) + 1;

            //C: 
            for (int j = 0; j < 1; j++) {

                //C.1: 
                Card temp = tDeck.get(i);
                tDeck.set(i, tDeck.get(rando));
                tDeck.set(rando, temp);

            }//End C

        }
        return tDeck;
    }

} //End class
