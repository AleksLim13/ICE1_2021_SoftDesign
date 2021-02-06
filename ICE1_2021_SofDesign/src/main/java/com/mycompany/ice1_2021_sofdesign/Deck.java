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

    private Card suit = new Card();
    String[] suits = suit.getSUITS();
    private ArrayList<Card> deck = new ArrayList<Card>();
    //0:CLUBS | 1:SPADES | 2:DIAMONDS | 3:HEARTS

    public ArrayList<Card> initDeckP1(int value) {
        //Start 1's: 
        for (int i = 0; i < 4; i++) {
            deck.add(new Card(suits[i], value));

        }
        return deck;
    }

    //Initialize deck with 4 of 1-13. 
    //Of objects as cards with 2 fields 
    public ArrayList<Card> initDeck() {
        //A: 
        ArrayList<Card> tDeck = new ArrayList<>();
        
        //B: 
        for (int i = 1; i <= 13; i++) {
            //C: 
            for (int j = 0; j < 4; j++) {
                tDeck.add(new Card(suits[i], i));

            }
        }
        //D: 
        return tDeck;
    }

    public Deck() {

    }

}
